package com.rahul.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Data
@Entity
public class Orders {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 
	@ManyToOne 
	private Customer customer; 
	@OneToMany(cascade = CascadeType.ALL) 
	private List<OrderItem> items; 
	@Column 
	private double total; 
	 
	 // Getters and setters for the fields 
	 // ...  
}
