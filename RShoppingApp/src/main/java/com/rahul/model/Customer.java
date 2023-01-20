package com.rahul.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity 
public class Customer { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 
	@Column
	private String name; 
	@Column 
	private String email; 
	@OneToOne(cascade = CascadeType.ALL) 
	private Address shippingAddress; 
	@OneToMany(mappedBy = "customer") 
	private List<Orders> orders; 
 
 // Getters and setters for the fields 
 // ... 
} 