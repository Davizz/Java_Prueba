package com.Farmazia.crud.service;

import java.util.List;

import com.Farmazia.crud.model.Category;

public interface CategoryService {
	void save(Category category);

	List<?> listCategories();

	void deleteCategory(long id);

	Category getCategory(long id);

	long numCategories();
}
