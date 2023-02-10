package com.rahul.services;

import java.util.List;

import com.rahul.execptions.ProductException;
import com.rahul.model.Product;

public interface ProductService {

	public List<Product> getAllProducts() throws ProductException;
	
	public Product getProductById(Long id) throws ProductException;
	
	
	public Product createProduct(Product product);
	
	public Product updateProduct(Long id, Product product) throws ProductException;
	
	public String deleteProduct(Long id) throws ProductException;
}
