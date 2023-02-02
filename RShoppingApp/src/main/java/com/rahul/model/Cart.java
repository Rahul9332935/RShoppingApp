package com.rahul.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity 
@Data
public class Cart { 
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 private Long id; 
 @OneToOne 
 private Customer customer; 
 @OneToMany(cascade = CascadeType.ALL) 
 private List<CartItem> items; 
 
 // Getters and setters for the fields 
 // ... 
} 