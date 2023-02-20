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

import com.rahul.execptions.OrderException;
import com.rahul.model.Orders;
import com.rahul.services.OrderService;
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders") 
	public ResponseEntity<List<Orders>> getAllOrders() throws OrderException {
		List<Orders> orders= orderService.getAllOrders();
		return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
	}

	@GetMapping("/orders/{id}") 
	public  ResponseEntity<Orders> getOrderById(@PathVariable Long id) throws OrderException {
		Orders order= orderService.getOrderById(id);
		return new ResponseEntity<Orders>(order, HttpStatus.OK);
	}

	@PostMapping("/orders") 
	public ResponseEntity<Orders> createOrder(@RequestBody Orders order) {
		Orders order1= orderService.createOrder(order);
		return new ResponseEntity<Orders>(order1, HttpStatus.ACCEPTED);
	}

	@PutMapping("/orders/{id}") 
	public ResponseEntity<Orders> updateOrder(@PathVariable Long id,@RequestBody Orders order) throws OrderException {
		Orders order1= orderService.updateOrder(id, order);
		return new ResponseEntity<Orders>(order1, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/orders/{id}") 
	public void deleteOrder(@PathVariable Long id) throws OrderException {
		orderService.deleteOrder(id);
		
	}

}
