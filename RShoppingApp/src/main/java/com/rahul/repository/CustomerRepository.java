package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
