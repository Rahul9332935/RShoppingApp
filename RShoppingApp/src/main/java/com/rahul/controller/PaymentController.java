package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.execptions.PaymentException;
import com.rahul.model.Payment;
import com.rahul.services.PaymentService;

@RestController
public class PaymentController  {

	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/payments") 
	public ResponseEntity<List<Payment>> getAllPayments() throws PaymentException {
		List<Payment> payments =paymentService.getAllPayments();
		
		return new ResponseEntity<List<Payment>>(payments, HttpStatus.OK);
	}

	@GetMapping("/payments/{id}") 
	public ResponseEntity<Payment> getPaymentById(@PathVariable Long id) throws PaymentException {
		Payment pay=paymentService.getPaymentById(id);
		return new ResponseEntity<Payment>(pay, HttpStatus.OK);
	}

	@PostMapping("/payments") 
	public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
		Payment payment1=paymentService.createPayment(payment);
		
		return new ResponseEntity<Payment>(payment1, HttpStatus.ACCEPTED);
	}

	@PutMapping("/payments/{id}") 
	public ResponseEntity<Payment> updatePayment(@PathVariable Long id, @RequestBody Payment payment) throws PaymentException {
		Payment payment2 =paymentService.updatePayment(id, payment);
		return new ResponseEntity<Payment>(payment2, HttpStatus.OK);
	}

	@DeleteMapping("/payments/{id}") 
	public void deletePayment(@PathVariable Long id) throws PaymentException {
		paymentService.deletePayment(id);
		
	}

}
