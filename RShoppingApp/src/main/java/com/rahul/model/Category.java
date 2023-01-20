package com.rahul.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity 
public class Category { 
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private Long id; 
@Column 
private String name; 
@ManyToMany(mappedBy = "categories") 
private List<Product> products; 

 
} 