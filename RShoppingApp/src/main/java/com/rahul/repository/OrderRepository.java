package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.model.Orders;
@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
