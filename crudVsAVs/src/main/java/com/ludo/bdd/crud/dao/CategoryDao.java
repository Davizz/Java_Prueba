package com.ludo.bdd.crud.dao;

import java.util.List;

import com.ludo.bdd.crud.model.Category;

public interface CategoryDao {

	Category get(long id);

	void save(Category category);

	void delete(long id);

	long num();

	List<?> list();

}
