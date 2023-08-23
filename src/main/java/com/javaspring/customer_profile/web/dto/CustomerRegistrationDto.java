package com.javaspring.customer_profile.web.dto;

import java.time.LocalDateTime;

public class CustomerRegistrationDto {

    private Long id;
    private String customerFirstName;
    private String customerLastName;
    private String email;

    public CustomerRegistrationDto() {
        // Default constructor
    }
    public CustomerRegistrationDto( String customerFirstName, String customerLastName, String email) {
        super();
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.email = email;

    }

    public Long getId() {
        return id;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getEmail() {
        return email;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
