package com.Farmacia.dao;

import java.util.List;


import com.Farmacia.model.Product;
import com.Farmacia.model.User;

public interface ProductDao {
	void save(Product product);

	List<?> list();
	
	void delete(long id);
	
	Product get(long id);
	
	long num();	
}
