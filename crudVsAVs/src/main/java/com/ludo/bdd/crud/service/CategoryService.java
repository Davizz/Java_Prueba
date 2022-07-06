package com.ludo.bdd.crud.service;

import com.ludo.bdd.crud.model.Category;

public interface CategoryService {

	Category getCategory(long id);

	Object listCategories();

	Object numCategories();

	void save(Category category);

	void deleteCategory(long id);

}
