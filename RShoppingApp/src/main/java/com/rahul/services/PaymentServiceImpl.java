package com.rahul.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.execptions.PaymentException;
import com.rahul.model.Payment;
import com.rahul.repository.PaymentRepository;

@Service 
public class PaymentServiceImpl implements PaymentService { 

@Autowired 
private PaymentRepository paymentRepository; 

	 public List<Payment> getAllPayments() throws PaymentException { 
		List<Payment> payments= paymentRepository.findAll(); 
		if(payments.size()==0) {
			throw new PaymentException("No data available");
		}
		return payments;
	 } 
	 
	 public Payment getPaymentById(Long id) throws PaymentException { 
		 Optional<Payment> op= paymentRepository.findById(id); 
		 if(op.isEmpty()) {
			 throw new PaymentException("No data available by this id :- "+id);
		 }
		 return op.get();
	 } 
	 
	 public Payment createPayment(Payment payment) { 
		 return paymentRepository.save(payment); 
	 } 
	 
	 public Payment updatePayment(Long id, Payment payment) throws PaymentException { 
		 Payment existingPayment = getPaymentById(id); 
		  
		 existingPayment.setOrder(payment.getOrder()); 
		 existingPayment.setMethod(payment.getMethod()); 
		 existingPayment.setDetails(payment.getDetails()); 
		 return paymentRepository.save(existingPayment); 
	 } 
	 
	 public void deletePayment(Long id) throws PaymentException { 
		 Payment existingPayment = getPaymentById(id); 
		 paymentRepository.delete(existingPayment);
	 } 
	}