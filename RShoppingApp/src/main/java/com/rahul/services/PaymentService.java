package com.rahul.services;

import java.util.List;

import com.rahul.model.Payment;

public interface PaymentService {

	public List<Payment> getAllPayments();
	
	public Payment getPaymentById(Long id);
	
	public Payment createPayment(Payment payment) ;
	
	public Payment updatePayment(Long id, Payment payment);
	
	 public void deletePayment(Long id);
	
	
}
