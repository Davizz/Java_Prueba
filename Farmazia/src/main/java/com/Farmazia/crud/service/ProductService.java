package com.Farmazia.crud.service;

import java.util.List;

import com.Farmazia.crud.model.Product;

public interface ProductService {
	void save(Product product);

	List<?> listProducts();

	void deleteProduct(long id);

	Product getProduct(long id);

	long numProducts();
}
