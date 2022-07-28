package com.Farmazia.crud.dao;

import java.util.List;

import com.Farmazia.crud.model.Product;

public interface ProductDao {
	void save(Product product);

	List<?> list();

	void delete(long id);

	Product get(long id);

	long num();
}
