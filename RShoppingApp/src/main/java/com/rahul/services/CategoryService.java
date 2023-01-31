package com.rahul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.model.Category;
import com.rahul.repository.CategoryRepository;

@Service 
public class CategoryService { 

	@Autowired 
	private CategoryRepository categoryRepository; 

	public List<Category> getAllCategories() { 
		return categoryRepository.findAll(); 
	} 

	public Category getCategoryById(Long id) { 
		return categoryRepository.findById(id).orElse(null); 
	} 

	public Category createCategory(Category category) { 
		return categoryRepository.save(category); 
	} 
	public Category updateCategory(Long id, Category category) { 
		Category existingCategory = categoryRepository.findById(id).orElse(null); 
		if (existingCategory == null) { 
		return null; 
		} 
		existingCategory.setName(category.getName()); 
		existingCategory.setProducts(category.getProducts()); 
		return categoryRepository.save(existingCategory); 
	 	} 
	 
	public void deleteCategory(Long id) { 
	  categoryRepository.deleteById(id); 
	} 
	
} 