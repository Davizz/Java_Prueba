package com.Farmacia.service;

import java.util.List;

import com.Farmacia.model.Product;
import com.Farmacia.model.User;

public interface ProductService {
	void save(Product product);

	List<?> listProducts();

	void deleteProduct(long id);

	Product getProduct(long id);

	long numProducts();

	void loanProducts(User user);
}
