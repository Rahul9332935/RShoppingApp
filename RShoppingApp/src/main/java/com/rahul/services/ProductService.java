package com.rahul.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.execptions.ProductException;
import com.rahul.model.Product;
import com.rahul.repository.ProductRepository;

@Service 
public class ProductService { 
 
 @Autowired 
 private ProductRepository productRepository; 
 
 public List<Product> getAllProducts() throws ProductException { 
  List<Product> allProducts= productRepository.findAll(); 
  if(allProducts.size()==0) {
	  throw new ProductException("Product is not available");
  }
  return allProducts;
 } 
 
 public Product getProductById(Long id) throws ProductException { 
  Optional<Product> product = productRepository.findById(id); 
  if(product.isEmpty()) {
	  throw new ProductException("Invaild product Id");
  }
  return product.get();
 } 
 
 public Product createProduct(Product product) { 
  return productRepository.save(product); 
 } 
 
 public Product updateProduct(Long id, Product product) throws ProductException { 
  Product existingProduct  = getProductById(id);
   
  existingProduct.setName(product.getName()); 
  existingProduct.setPrice(product.getPrice()); 
  existingProduct.setDescription(product.getDescription()); 
  existingProduct.setImages(product.getImages()); 
  existingProduct.setAvailable(product.isAvailable()); 
  existingProduct.setShippingInfo(product.getShippingInfo()); 
  return productRepository.save(existingProduct); 
 } 
 
 public String deleteProduct(Long id) throws ProductException { 
	Product product=  getProductById(id);
  productRepository.delete(product);
 } 
} 
