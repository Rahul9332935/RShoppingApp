package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}
