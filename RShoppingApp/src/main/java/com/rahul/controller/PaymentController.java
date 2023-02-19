package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.execptions.PaymentException;
import com.rahul.model.Payment;
import com.rahul.services.PaymentService;

@RestController
public class PaymentController  {

	@Autowired
	private PaymentService paymentService;
	
	
	public ResponseEntity<List<Payment>> getAllPayments() throws PaymentException {
		List<Payment> payments =paymentService.getAllPayments();
		
		return new ResponseEntity<List<Payment>>(payments, HttpStatus.OK);
	}

	
	public ResponseEntity<Payment> getPaymentById(Long id) throws PaymentException {
		Payment pay=paymentService.getPaymentById(id);
		return new ResponseEntity<Payment>(pay, HttpStatus.OK);
	}

	
	public ResponseEntity<Payment> createPayment(Payment payment) {
		Payment payment1=paymentService.createPayment(payment);
		
		return new ResponseEntity<Payment>(payment1, HttpStatus.ACCEPTED);
	}

	
	public ResponseEntity<Payment> updatePayment(Long id, Payment payment) throws PaymentException {
		Payment payment2 =paymentService.updatePayment(id, payment);
		return new ResponseEntity<Payment>(payment2, HttpStatus.OK);
	}

	
	public void deletePayment(Long id) throws PaymentException {
		paymentService.deletePayment(id);
		
	}

}
