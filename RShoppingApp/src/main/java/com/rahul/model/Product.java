package com.rahul.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Product { 
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private Long id; 
	 @Column 
	 private String name; 
	 @Column 
	 private double price; 
	 @Column 
	 private String description; 
	 @Column 
	 private List<String> images; 
	 @Column 
	 private boolean available; 
	 @Column 
	 private String shippingInfo; 
	 
}
