package com.erp.model;
import java.time.*;

import javax.persistence.*;

@Entity
@Table(name ="customer123", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class CustomerProfile
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String email;
    private String createdBy;
    private LocalDateTime creationDate;
    private String updatedBy;
    private LocalDateTime updationDate;

    public CustomerProfile(String customerName, String email, String createdBy, LocalDateTime creationDate, String updatedBy, LocalDateTime updationDate) {
        super();
        this.customerName = customerName;
        this.email = email;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.updatedBy = updatedBy;
        this.updationDate = updationDate;

    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
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

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
