package com.javaspring.customer_profile.model;
import java.time.*;

import javax.persistence.*;

@Entity
@Table(name ="customer", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class CustomerProfile
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerFirstName;
    private String customerLastName;
    private String email;
    private String createdBy;
    private LocalDateTime creationDate;
    private String updatedBy;
    private LocalDateTime updationDate;

    public CustomerProfile(String customerFirstName, String customerLastName, String email, String createdBy, LocalDateTime creationDate, String updatedBy, LocalDateTime updationDate) {
        super();
        System.out.println("ok");
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.email = email;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.updatedBy = updatedBy;
        this.updationDate = updationDate;

    }

    public long getId() {
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

    public void setId(long id) {
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
