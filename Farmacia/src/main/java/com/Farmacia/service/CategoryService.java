package com.Farmacia.service;

import java.util.List;

import com.Farmacia.model.Product;
import com.Farmacia.model.Category;

public interface CategoryService {
	void save(Category category);

	List<?> listCategories();

	void deleteCategory(long id);

	Category getCategory(long id);

	long numCategories();
}
