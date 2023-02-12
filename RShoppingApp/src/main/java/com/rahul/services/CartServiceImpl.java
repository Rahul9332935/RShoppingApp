package com.rahul.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.execptions.CartException;
import com.rahul.model.Cart;
import com.rahul.repository.CartRepository;

@Service 
public class CartServiceImpl implements CartService{ 
 
	@Autowired 
	private CartRepository cartRepository; 
 
	public List<Cart> getAllCarts() throws CartException { 
		List<Cart> carts= cartRepository.findAll(); 
		if(carts.size()==0) {
			throw new CartException("No Data available");
		}
		return carts;
	} 
 
	public Cart getCartById(Long id) throws CartException { 
		Optional<Cart> op= cartRepository.findById(id);
		if(op.isEmpty()) {
			throw new CartException("Cart id :- "+id +" is not vaild");
		}
		return op.get();
	} 
 
	public Cart createCart(Cart cart) { 
		return cartRepository.save(cart); 
	} 
 
	public Cart updateCart(Long id, Cart cart) throws CartException { 
		Cart existingCart = getCartById(id);  
		existingCart.setCustomer(cart.getCustomer()); 
		existingCart.setItems(cart.getItems()); 
		return cartRepository.save(existingCart); 
	} 
 
	public void deleteCart(Long id) throws CartException { 
		Cart cart =getCartById(id);
		
		cartRepository.delete(cart);
	} 
} 