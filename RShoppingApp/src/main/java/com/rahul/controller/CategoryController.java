package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.execptions.CategoryException;
import com.rahul.model.Category;
import com.rahul.services.CategoryService;

@RestController 
public class CategoryController { 
 
	@Autowired 
 	private CategoryService categoryService; 
 
	@GetMapping("/categories") 
	public ResponseEntity<List<Category>> getAllCategories() throws CategoryException { 
		return new ResponseEntity<>( categoryService.getAllCategories(), HttpStatus.OK); 
	} 
 
	@GetMapping("/categories/{id}") 
	public ResponseEntity<Category> getCategoryById(@PathVariable Long id) throws CategoryException { 
		return new ResponseEntity<>( categoryService.getCategoryById(id), HttpStatus.OK); 
	} 
 
	@PostMapping("/categories") 
	public ResponseEntity<Category> createCategory(@RequestBody Category category) { 
		return new ResponseEntity<>(categoryService.createCategory(category), HttpStatus.CREATED); 
	} 
 
	@PutMapping("/categories/{id}") 
	public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category category) throws CategoryException { 
		return new ResponseEntity<>( categoryService.updateCategory(id, category), HttpStatus.ACCEPTED); 
	} 
	
	@DeleteMapping("/categories/{id}") 
	public void deleteCategory(@PathVariable Long id) throws CategoryException { 
		categoryService.deleteCategory(id); 
	} 
}
