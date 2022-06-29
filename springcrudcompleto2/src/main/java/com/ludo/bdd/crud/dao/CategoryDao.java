package com.ludo.bdd.crud.dao;

import java.util.List;

import com.ludo.bdd.crud.model.Category;

public interface CategoryDao {
	void save(Category category);

	List<?> list();
	
	void delete(long id);
	
	Category get(long id);
	
	long num();
}
