package com.rahul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.model.Payment;
import com.rahul.repository.PaymentRepository;

@Service 
public class PaymentServiceImpl implements PaymentService { 

@Autowired 
private PaymentRepository paymentRepository; 

	 public List<Payment> getAllPayments() { 
		return paymentRepository.findAll(); 
	 } 
	 
	 public Payment getPaymentById(Long id) { 
		 return paymentRepository.findById(id).orElse(null); 
	 } 
	 
	 public Payment createPayment(Payment payment) { 
		 return paymentRepository.save(payment); 
	 } 
	 
	 public Payment updatePayment(Long id, Payment payment) { 
		 Payment existingPayment = paymentRepository.findById(id).orElse(null); 
		 if (existingPayment == null) { 
			 return null; 
		 } 
		 existingPayment.setOrder(payment.getOrder()); 
		 existingPayment.setMethod(payment.getMethod()); 
		 existingPayment.setDetails(payment.getDetails()); 
		 return paymentRepository.save(existingPayment); 
	 } 
	 
	 public void deletePayment(Long id) { 
		 paymentRepository.deleteById(id); 
	 } 
	}