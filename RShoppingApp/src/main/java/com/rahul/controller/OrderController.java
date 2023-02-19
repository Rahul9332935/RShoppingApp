package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.rahul.execptions.OrderException;
import com.rahul.model.Orders;
import com.rahul.services.OrderService;

public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	public ResponseEntity<List<Orders>> getAllOrders() throws OrderException {
		List<Orders> orders= orderService.getAllOrders();
		return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
	}

	
	public  ResponseEntity<Orders> getOrderById(Long id) throws OrderException {
		Orders order= orderService.getOrderById(id);
		return new ResponseEntity<Orders>(order, HttpStatus.OK);
	}

	
	public ResponseEntity<Orders> createOrder(Orders order) {
		Orders order1= orderService.createOrder(order);
		return new ResponseEntity<Orders>(order1, HttpStatus.ACCEPTED);
	}

	
	public ResponseEntity<Orders> updateOrder(Long id, Orders order) throws OrderException {
		Orders order1= orderService.updateOrder(id, order);
		return new ResponseEntity<Orders>(order1, HttpStatus.ACCEPTED);
	}

	
	public void deleteOrder(Long id) throws OrderException {
		orderService.deleteOrder(id);
		
	}

}
