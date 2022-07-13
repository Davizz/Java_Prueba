package com.Farmacia.dao;

import java.util.List;

import com.Farmacia.model.Category;

public interface CategoryDao {
	void save(Category category);

	List<?> list();

	void delete(long id);

	Category get(long id);

	long num();
}
