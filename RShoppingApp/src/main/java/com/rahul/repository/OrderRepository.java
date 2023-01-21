package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
