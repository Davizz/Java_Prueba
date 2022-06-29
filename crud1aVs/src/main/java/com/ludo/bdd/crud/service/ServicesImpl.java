package com.ludo.bdd.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ludo.bdd.crud.dao.BookDao;
import com.ludo.bdd.crud.dao.CategoryDao;
import com.ludo.bdd.crud.dao.UserDao;
import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.Category;
import com.ludo.bdd.crud.model.User;

@Service
public class ServicesImpl implements UserService, BookService, CategoryService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private BookDao bookDao;
	
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
	
	@Transactional
	public void save(Book book) {
		bookDao.save(book);
	}	

	@Override
	@Transactional(readOnly = true)
	public List<User> listUsers() {
		return userDao.list();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<?> listBooks() {
		return bookDao.list();
	}

	@Override
	@Transactional
	public void deleteUser(long id) {		
		userDao.delete(id);		
	}
	
	@Override
	@Transactional
	public void deleteBook(long id) {		
		bookDao.delete(id);		
	}

	@Override
	@Transactional
	public User getUser(long id) {
		User user = userDao.get(id);	
		return user; 
	}
	
	@Override
	@Transactional
	public Book getBook(long id) {
		Book book = bookDao.get(id);	
		return book; 
	}

	@Override
	@Transactional
	public long numUsers() {		
		return userDao.num();
	}

	@Override
	@Transactional
	public long numBooks() {		
		return bookDao.num();
	}

	@Override
	@Transactional
	public Category getCategory(long id) {
		Category category = categoryDao.get(id);	
		return category; 
	}

	@Override
	@Transactional(readOnly = true)
	public Object listCategories() {
		// TODO Auto-generated method stub
		return categoryDao.list();
	}

	@Override
	@Transactional
	public Object numCategories() {
		// TODO Auto-generated method stub
		return categoryDao.num();
	}

	@Override
	@Transactional
	public void save(Category category) {
		categoryDao.save(category);
		
	}

	@Override
	@Transactional
	public void deleteCategory(long id) {
		categoryDao.delete(id);
		
	}

}
