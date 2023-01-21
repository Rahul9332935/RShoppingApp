package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
