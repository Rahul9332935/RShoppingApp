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

import com.rahul.execptions.CategoryException;
import com.rahul.model.Category;
import com.rahul.services.CategoryService;

@RestController 
public class CategoryController { 
 
 @Autowired 
 private CategoryService categoryService; 
 
 @GetMapping("/categories") 
 public List<Category> getAllCategories() throws CategoryException { 
  return categoryService.getAllCategories(); 
 } 
 
 @GetMapping("/categories/{id}") 
 public Category getCategoryById(@PathVariable Long id) throws CategoryException { 
  return categoryService.getCategoryById(id); 
 } 
 
 @PostMapping("/categories") 
 public Category createCategory(@RequestBody Category category) { 
  return categoryService.createCategory(category); 
 } 
 
 @PutMapping("/categories/{id}") 
 public Category updateCategory(@PathVariable Long id, @RequestBody Category category) throws CategoryException { 
  return categoryService.updateCategory(id, category); 
 } 
 
 @DeleteMapping("/categories/{id}") 
 public void deleteCategory(@PathVariable Long id) throws CategoryException { 
  categoryService.deleteCategory(id); 
 } 
}
