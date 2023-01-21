package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { 
} 
