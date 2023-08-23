package com.javaspring.customer_profile.service;

import com.javaspring.customer_profile.model.CustomerProfile;
import com.javaspring.customer_profile.repository.CustomerProfileRepository;
import com.javaspring.customer_profile.web.dto.CustomerRegistrationDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class CustomerServiceImpl implements CustomerService
{
    private CustomerProfileRepository customerProfileRepository;
    public CustomerServiceImpl(CustomerProfileRepository customerProfileRepository) {
        super();
        this.customerProfileRepository=customerProfileRepository;
    }
    LocalDateTime current = LocalDateTime.now();
    @Override
    public CustomerProfile save(CustomerRegistrationDto registrationDto) {
        CustomerProfile customer = new CustomerProfile(registrationDto.getCustomerFirstName(), registrationDto.getCustomerLastName(),
                registrationDto.getEmail(),"admin",current,"admin",
                current);

        return customerProfileRepository.save(customer);
    }
}
