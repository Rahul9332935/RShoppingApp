package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.execptions.CartException;
import com.rahul.model.Cart;
import com.rahul.services.CartService;
@RestController
public class CartController {

	@Autowired
	private CartService cartService;
	
	@GetMapping("/cart") 
	public ResponseEntity<List<Cart>> getAllCarts() throws CartException {
		
		return new ResponseEntity<>(cartService.getAllCarts(), HttpStatus.OK);
	}
	@GetMapping("/cart/{id}") 
	public ResponseEntity<Cart> getCartById(@PathVariable Long id) throws CartException {
		
		return new ResponseEntity<>(cartService.getCartById(id),HttpStatus.OK);
	}
	@PostMapping("/cart") 
	public ResponseEntity<Cart> createCart(@RequestBody Cart cart) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(cartService.createCart(cart), HttpStatus.CREATED);
	}
	@PutMapping("/cart/{id}") 
	public ResponseEntity<Cart> updateCart(@PathVariable Long id, @RequestBody Cart cart) throws CartException {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(cartService.updateCart(id, cart), HttpStatus.OK);
	}
	@DeleteMapping("/cart/{id}") 
	public void deleteCart(@PathVariable Long id) throws CartException {
		cartService.deleteCart(id);
		
	}

}
