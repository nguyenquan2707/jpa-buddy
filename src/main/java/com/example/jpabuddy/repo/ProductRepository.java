package com.example.jpabuddy.repo;

import com.example.jpabuddy.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}