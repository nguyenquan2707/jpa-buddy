package com.example.jpabuddy.repo;

import com.example.jpabuddy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}