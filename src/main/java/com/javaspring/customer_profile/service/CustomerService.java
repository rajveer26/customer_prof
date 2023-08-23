package com.javaspring.customer_profile.service;

import com.javaspring.customer_profile.model.CustomerProfile;
import com.javaspring.customer_profile.web.dto.CustomerRegistrationDto;

public interface CustomerService
{
 CustomerProfile save(CustomerRegistrationDto registrationDto);
}
