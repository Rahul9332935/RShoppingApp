package com.rahul.services;

import java.util.List;
import java.util.Optional;

import javax.xml.catalog.CatalogException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.execptions.CategoryException;
import com.rahul.model.Category;
import com.rahul.repository.CategoryRepository;

@Service 
public class CategoryServiceImpl implements CategoryService { 

	@Autowired 
	private CategoryRepository categoryRepository; 

	public List<Category> getAllCategories() throws CategoryException { 
		List<Category> categorys= categoryRepository.findAll(); 
		if(categorys.size()==0) {
			throw new CategoryException("No Data availabel");
		}
		return categorys;
	} 

	public Category getCategoryById(Long id) throws CategoryException { 
		Optional<Category> category= categoryRepository.findById(id);
		if(category.isEmpty()) {
			throw new CategoryException("Not a vaild id");
		}
		return category.get();
	} 

	public Category createCategory(Category category) { 
		return categoryRepository.save(category); 
	} 
	public Category updateCategory(Long id, Category category) throws CategoryException { 
		Category existingCategory = getCategoryById(id); 
		 
		existingCategory.setName(category.getName()); 
		existingCategory.setProducts(category.getProducts()); 
		return categoryRepository.save(existingCategory); 
	 	} 
	 
	public void deleteCategory(Long id) throws CategoryException { 
		Category cat=getCategoryById(id);
		categoryRepository.delete(cat);
	} 
	
} 