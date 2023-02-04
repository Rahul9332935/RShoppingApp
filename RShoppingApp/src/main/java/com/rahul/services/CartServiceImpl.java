package com.rahul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.model.Cart;
import com.rahul.repository.CartRepository;

@Service 
public class CartServiceImpl { 
 
 @Autowired 
 private CartRepository cartRepository; 
 
 public List<Cart> getAllCarts() { 
  return cartRepository.findAll(); 
 } 
 
 public Cart getCartById(Long id) { 
  return cartRepository.findById(id).orElse(null); 
 } 
 
 public Cart createCart(Cart cart) { 
  return cartRepository.save(cart); 
 } 
 
 public Cart updateCart(Long id, Cart cart) { 
  Cart existingCart = cartRepository.findById(id).orElse(null); 
  if (existingCart == null) { 
   return null; 
  } 
  existingCart.setCustomer(cart.getCustomer()); 
  existingCart.setItems(cart.getItems()); 
  return cartRepository.save(existingCart); 
 } 
 
 public void deleteCart(Long id) { 
  cartRepository.deleteById(id); 
 } 
} 