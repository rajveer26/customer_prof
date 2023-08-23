package com.javaspring.customer_profile.web;

// CustomerRegistrationDto.java (as provided earlier)

// CustomerRegistrationController.java
import com.javaspring.customer_profile.service.CustomerService;
import com.javaspring.customer_profile.web.dto.CustomerRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
@Component
public class CustomerRegistrationController {

    @Autowired
    private CustomerService customerService;

    private CustomerRegistrationDto customerRegistrationDto = new CustomerRegistrationDto();

    public CustomerRegistrationDto getCustomerRegistrationDto() {
        return customerRegistrationDto;
    }

    public void setCustomerRegistrationDto(CustomerRegistrationDto customerRegistrationDto) {
        this.customerRegistrationDto = customerRegistrationDto;
    }

    public String registerCustomer() {
        customerService.save(customerRegistrationDto);
        return "success";
    }
}

