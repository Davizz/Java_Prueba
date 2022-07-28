package com.ludo.bdd.crud.service;

import java.util.List;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.Category;

public interface CategoryService {
	void save(Category category);

	List<?> listCategories();

	void deleteCategory(long id);

	Category getCategory(long id);

	long numCategories();
}
