package com.rahul.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.execptions.OrderException;
import com.rahul.model.Orders;
import com.rahul.repository.OrderRepository;

@Service 
public class OrderServiceImpl implements OrderService { 

	@Autowired 
	private OrderRepository orderRepository; 

	public List<Orders> getAllOrders() throws OrderException { 
		List<Orders>orders= orderRepository.findAll(); 
		if(orders.size()==0) {
			throw new OrderException("No Data available");
		}
		return orders;
	} 

	public Orders getOrderById(Long id) throws OrderException { 
		Optional<Orders> op= orderRepository.findById(id);
		if(op.isEmpty()) {
			throw new OrderException("No Order available with this order ID:- "+id);
		}
		return op.get();
	} 

	public Orders createOrder(Orders order) { 
		return orderRepository.save(order); 
	} 

	public Orders updateOrder(Long id, Orders order) throws OrderException { 
		Orders existingOrder = orderRepository.findById(id).orElse(null); 
		if (existingOrder == null) { 
			throw new OrderException("No Order available with this order ID:- "+id);
		} 
		existingOrder.setCustomer(order.getCustomer()); 
		existingOrder.setItems(order.getItems()); 
		existingOrder.setTotal(order.getTotal()); 
		return orderRepository.save(existingOrder); 
	} 

	public void deleteOrder(Long id) throws OrderException {
		Orders order=getOrderById(id);
		orderRepository.delete(order);
	} 
} 
