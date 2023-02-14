package com.rahul.services;

import java.util.List;

import com.rahul.execptions.OrderException;
import com.rahul.model.Orders;

public interface OrderService {
	
	public List<Orders> getAllOrders() throws OrderException;
	
	public Orders getOrderById(Long id) throws OrderException ;
	
	public Orders createOrder(Orders order);
	
	public Orders updateOrder(Long id, Orders order) throws OrderException;
	
	public void deleteOrder(Long id) throws OrderException;
}
