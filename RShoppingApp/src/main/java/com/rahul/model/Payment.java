package com.rahul.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity 
@Data
public class Payment { 
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 private Long id; 
 @OneToOne 
 private Orders order; 
 @Column 
 private PaymentMethod method; 
 @Column 
 private String details; 
 
 // Getters and setters for the fields 
 // ... 
} 
