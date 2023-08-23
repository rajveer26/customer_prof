package com.javaspring.customer_profile.web.dto;

import java.time.LocalDateTime;

public class CustomerRegistrationDto {

    private Long id;
    private String customerFirstName;
    private String customerLastName;
    private String email;
    private String createdBy;
    private LocalDateTime creationDate;
    private String updatedBy;
    private LocalDateTime updationDate;

    public CustomerRegistrationDto(Long id, String customerFirstName, String customerLastName, String email, String createdBy, LocalDateTime creationDate, String updatedBy, LocalDateTime updationDate) {
        super();
        this.id = id;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.email = email;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.updatedBy = updatedBy;
        this.updationDate = updationDate;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public LocalDateTime getUpdationDate() {
        return updationDate;
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

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public void setUpdationDate(LocalDateTime updationDate) {
        this.updationDate = updationDate;
    }
}
