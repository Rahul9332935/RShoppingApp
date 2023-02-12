package com.rahul.services;

import java.util.List;

import com.rahul.execptions.CartException;
import com.rahul.model.Cart;

public interface CartService {
	
	 public List<Cart> getAllCarts() throws CartException;
	
	 public Cart getCartById(Long id) throws CartException;
	 
	 public Cart createCart(Cart cart);
	 
	 public Cart updateCart(Long id, Cart cart) throws CartException;
	 
	 public void deleteCart(Long id) throws CartException;

}
