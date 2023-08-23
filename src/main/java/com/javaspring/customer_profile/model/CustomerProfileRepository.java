package com.javaspring.customer_profile.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerProfileRepository extends JpaRepository<CustomerProfile,Long>
{

}
