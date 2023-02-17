package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.execptions.CartException;
import com.rahul.model.Cart;
import com.rahul.services.CartService;
@RestController
public class CartController {

	@Autowired
	private CartService cartService;
	
	public ResponseEntity<List<Cart>> getAllCarts() throws CartException {
		
		return new ResponseEntity<>(cartService.getAllCarts(), HttpStatus.OK);
	}

	public ResponseEntity<Cart> getCartById(Long id) throws CartException {
		
		return new ResponseEntity<>(cartService.getCartById(id),HttpStatus.OK);
	}

	public ResponseEntity<Cart> createCart(Cart cart) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(cartService.createCart(cart), HttpStatus.CREATED);
	}

	public ResponseEntity<Cart> updateCart(Long id, Cart cart) throws CartException {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(cartService.updateCart(id, cart), HttpStatus.OK);
	}

	public void deleteCart(Long id) throws CartException {
		cartService.deleteCart(id);
		
	}

}
