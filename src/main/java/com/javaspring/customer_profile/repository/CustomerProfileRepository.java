package com.javaspring.customer_profile.repository;

import com.javaspring.customer_profile.model.CustomerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerProfileRepository extends JpaRepository<CustomerProfile,Long>
{

}
