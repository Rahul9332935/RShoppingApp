package com.rahul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.model.Product;
import com.rahul.repository.ProductRepository;

@Service 
public class ProductService { 
 
 @Autowired 
 private ProductRepository productRepository; 
 
 public List<Product> getAllProducts() { 
  return productRepository.findAll(); 
 } 
 
 public Product getProductById(Long id) { 
  return productRepository.findById(id).orElse(null); 
 } 
 
 public Product createProduct(Product product) { 
  return productRepository.save(product); 
 } 
 
 public Product updateProduct(Long id, Product product) { 
  Product existingProduct = productRepository.findById(id).orElse(null); 
  if (existingProduct == null) { 
   return null; 
  } 
  existingProduct.setName(product.getName()); 
  existingProduct.setPrice(product.getPrice()); 
  existingProduct.setDescription(product.getDescription()); 
  existingProduct.setImages(product.getImages()); 
  existingProduct.setAvailable(product.isAvailable()); 
  existingProduct.setShippingInfo(product.getShippingInfo()); 
  return productRepository.save(existingProduct); 
 } 
 
 public void deleteProduct(Long id) { 
  productRepository.deleteById(id); 
 } 
} 
