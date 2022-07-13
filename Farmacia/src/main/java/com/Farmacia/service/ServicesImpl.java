package com.Farmacia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Farmacia.dao.ProductDao;
import com.Farmacia.dao.CategoryDao;
import com.Farmacia.dao.UserDao;
import com.Farmacia.model.Product;
import com.Farmacia.model.Category;
import com.Farmacia.model.User;

@Service
public class ServicesImpl implements UserService, ProductService, CategoryService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private ProductDao productDao;
	@Autowired
	private CategoryDao categoryDao;

	@Override
	@Transactional
	public void save(User user) {		
		User copiaUser = new User(); 
		copiaUser.setEmail(user.getEmail().toLowerCase());
		copiaUser.setName(user.getName().toUpperCase());
		copiaUser.setId(user.getId());
		userDao.save(copiaUser);
	}
	
	@Override
	@Transactional
	public void save(Product product) {
		productDao.save(product);
	}	

	@Override
	@Transactional(readOnly = true)
	public List<User> listUsers() {
		return userDao.list();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<?> listProducts() {
		return productDao.list();
	}

	@Override
	@Transactional
	public void deleteUser(long id) {		
		userDao.delete(id);		
	}
	
	@Override
	@Transactional
	public void deleteProduct(long id) {		
		productDao.delete(id);		
	}

	@Override
	@Transactional
	public User getUser(long id) {
		User user = userDao.get(id);	
		return user; 
	}
	
	@Override
	@Transactional
	public Product getProduct(long id) {
		Product product = productDao.get(id);	
		return product; 
	}

	@Override
	@Transactional
	public long numUsers() {		
		return userDao.num();
	}

	@Override
	@Transactional
	public long numProducts() {		
		return productDao.num();
	}

	@Override
	@Transactional
	public void save(Category category) {
		categoryDao.save(category);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<?> listCategories() {
		return categoryDao.list();
	}

	@Override
	@Transactional
	public void deleteCategory(long id) {
		categoryDao.delete(id);	
		
	}

	@Override
	@Transactional
	public Category getCategory(long id) {
		Category category = categoryDao.get(id);	
		return category; 
	}

	@Override
	@Transactional
	public long numCategories() {
		return categoryDao.num();
	}

	@Override
	@Transactional
	public void loanProducts(User user) {
		
	
		userDao.loanProducts(user);
		
	}

	@Override
	public void loanBooks(User user) {
		// TODO Auto-generated method stub
		
	}

	
	

}
