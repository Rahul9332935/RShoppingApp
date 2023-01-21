package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
