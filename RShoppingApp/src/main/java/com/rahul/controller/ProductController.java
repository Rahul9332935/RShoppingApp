package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
 public List<Product> getAllProducts() throws ProductException { 
  return productService.getAllProducts(); 
 } 
 
 @GetMapping("/products/{id}") 
 public Product getProductById(@PathVariable Long id) throws ProductException { 
  return productService.getProductById(id); 
 } 
 
 @PostMapping("/products") 
 public Product createProduct(@RequestBody Product product) { 
  return productService.createProduct(product); 
 } 
 
 @PutMapping("/products/{id}") 
 public Product updateProduct(@PathVariable Long id, @RequestBody Product product) throws ProductException { 
  return productService.updateProduct(id, product); 
 } 
 
 @DeleteMapping("/products/{id}") 
 public void deleteProduct(@PathVariable Long id) throws ProductException { 
  productService.deleteProduct(id); 
 } 
} 
 
