package com.rahul.services;

import java.util.List;

import com.rahul.model.Cart;

public interface CartService {
	
	 public List<Cart> getAllCarts();
	
	 public Cart getCartById(Long id);
	 
	 public Cart createCart(Cart cart);
	 
	 public Cart updateCart(Long id, Cart cart);
	 
	 public void deleteCart(Long id);

}
