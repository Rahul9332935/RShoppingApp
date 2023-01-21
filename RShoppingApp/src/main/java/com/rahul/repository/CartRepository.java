package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
