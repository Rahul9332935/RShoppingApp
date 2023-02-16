package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.execptions.CartException;
import com.rahul.model.Cart;
import com.rahul.services.CartService;
@RestController
public class CartController implements CartService {

	@Autowired
	private CartService cartService;
	
	@Override
	public List<Cart> getAllCarts() throws CartException {
		
		return cartService.getAllCarts();
	}

	@Override
	public Cart getCartById(Long id) throws CartException {
		
		return cartService.getCartById(id);
	}

	@Override
	public Cart createCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartService.createCart(cart);
	}

	@Override
	public Cart updateCart(Long id, Cart cart) throws CartException {
		// TODO Auto-generated method stub
		return cartService.updateCart(id, cart);
	}

	@Override
	public void deleteCart(Long id) throws CartException {
		cartService.deleteCart(id);
		
	}

}
