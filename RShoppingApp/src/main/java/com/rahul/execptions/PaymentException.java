package com.rahul.execptions;

public class PaymentException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PaymentException() {
		
	}
	
	public PaymentException(String message) {
		super(message);
	}

}
