package com.rahul.services;

import java.util.List;

import com.rahul.execptions.CategoryException;
import com.rahul.model.Category;

public interface CategoryService {
	
	public List<Category> getAllCategories() throws CategoryException;
	
	public Category getCategoryById(Long id) throws CategoryException;
	
	public Category createCategory(Category category);
	
	public Category updateCategory(Long id, Category category) throws CategoryException;
	
	public void deleteCategory(Long id) throws CategoryException;
}
