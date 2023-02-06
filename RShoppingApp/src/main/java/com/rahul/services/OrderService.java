package com.rahul.services;

import java.util.List;

import com.rahul.model.Orders;

public interface OrderService {
	
	public List<Orders> getAllOrders();
	
	public Orders getOrderById(Long id) ;
	
	public Orders createOrder(Orders order);
	
	public Orders updateOrder(Long id, Orders order);
	
	public void deleteOrder(Long id);
}
