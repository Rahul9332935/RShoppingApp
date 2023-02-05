package com.rahul.services;

import java.util.List;

import com.rahul.model.Category;

public interface CategoryService {
	
	public List<Category> getAllCategories();
	
	public Category getCategoryById(Long id);
	
	public Category createCategory(Category category);
	
	public Category updateCategory(Long id, Category category);
	
	public void deleteCategory(Long id);
}
