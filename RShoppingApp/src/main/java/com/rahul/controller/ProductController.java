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

import com.rahul.execptions.ProductException;
import com.rahul.model.Product;
import com.rahul.services.ProductService;

@RestController 
public class ProductController { 
 
	@Autowired 
	private ProductService productService; 
 
	@GetMapping("/products") 
	public ResponseEntity<List<Product>> getAllProducts() throws ProductException { 
		return new ResponseEntity<>( productService.getAllProducts(), HttpStatus.OK); 
	} 
 
	@GetMapping("/products/{id}") 
	public ResponseEntity<Product> getProductById(@PathVariable Long id) throws ProductException { 
		return new ResponseEntity<>( productService.getProductById(id), HttpStatus.OK); 
	} 
 
	@PostMapping("/products") 
	public ResponseEntity<Product> createProduct(@RequestBody Product product) { 
		return new ResponseEntity<>( productService.createProduct(product), HttpStatus.CREATED); 
	} 
 
	@PutMapping("/products/{id}") 
	public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) throws ProductException { 
		return new ResponseEntity<>( productService.updateProduct(id, product), HttpStatus.OK); 
	} 
 
	@DeleteMapping("/products/{id}") 
	public void deleteProduct(@PathVariable Long id) throws ProductException { 
		productService.deleteProduct(id); 
	} 
} 
 
