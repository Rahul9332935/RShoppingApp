package com.rahul.services;

import java.util.List;

import com.rahul.execptions.PaymentException;
import com.rahul.model.Payment;

public interface PaymentService {

	public List<Payment> getAllPayments() throws PaymentException;
	
	public Payment getPaymentById(Long id) throws PaymentException;
	
	public Payment createPayment(Payment payment) ;
	
	public Payment updatePayment(Long id, Payment payment) throws PaymentException;
	
	 public void deletePayment(Long id) throws PaymentException;
	
	
}
