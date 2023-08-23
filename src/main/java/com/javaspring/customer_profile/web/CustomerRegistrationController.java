package com.javaspring.customer_profile.web;

import com.javaspring.customer_profile.service.CustomerService;
import com.javaspring.customer_profile.web.dto.CustomerRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerRegistrationController {
private CustomerService customerService;

    public CustomerRegistrationController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }


    public String demoo()
    {
        return "ok";
    }

    @PostMapping("/registration")
    public String registerCustomerAccount(@RequestBody CustomerRegistrationDto customerRegistrationDto)
    {
      customerService.save(customerRegistrationDto);
      return "success";
    }
}
