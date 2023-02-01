package com.rahul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.model.Orders;
import com.rahul.repository.OrderRepository;

@Service 
public class OrderService { 

	@Autowired 
	private OrderRepository orderRepository; 

	public List<Orders> getAllOrders() { 
		return orderRepository.findAll(); 
	} 

	public Orders getOrderById(Long id) { 
		return orderRepository.findById(id).orElse(null); 
	} 

	public Orders createOrder(Orders order) { 
		return orderRepository.save(order); 
	} 

	public Orders updateOrder(Long id, Orders order) { 
		Orders existingOrder = orderRepository.findById(id).orElse(null); 
		if (existingOrder == null) { 
			return null; 
		} 
		existingOrder.setCustomer(order.getCustomer()); 
		existingOrder.setItems(order.getItems()); 
		existingOrder.setTotal(order.getTotal()); 
		return orderRepository.save(existingOrder); 
	} 

	public void deleteOrder(Long id) { 
		orderRepository.deleteById(id); 
	} 
} 
