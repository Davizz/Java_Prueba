package com.ludo.bdd.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ludo.bdd.crud.dao.BookDao;
import com.ludo.bdd.crud.dao.CategoryDao;
import com.ludo.bdd.crud.dao.RoleDao;
import com.ludo.bdd.crud.dao.UserDao;
import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.Category;
import com.ludo.bdd.crud.model.Role;
import com.ludo.bdd.crud.model.User;
import com.ludo.bdd.crud.other.Fecha;

@Service
public class ServicesImpl implements UserService, BookService, CategoryService, RoleService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private BookDao bookDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private RoleDao roleDao;

	@Override
	@Transactional
	public void save(User user) {
		User copiaUser = null;
		// Si se trata de una creación de usuario
		if (userDao.get(user.getUsername()) == null) {
			copiaUser = new User();
			copiaUser.setUsername(user.getUsername());
			copiaUser.setEnabled(true);
			copiaUser.setUpdatedAt(Fecha.getTimeStamp("Europe/Madrid"));
			copiaUser.setCreatedAt(Fecha.getTimeStamp("Europe/Madrid"));
		} else {// El usuario ya existe
			copiaUser = userDao.get(user.getUsername());
			copiaUser.setUsername(user.getUsername());
			copiaUser.setEnabled(user.isEnabled());
			copiaUser.setUpdatedAt(Fecha.getTimeStamp("Europe/Madrid"));
		}
		copiaUser.setEmail(user.getEmail().toLowerCase());
		copiaUser.setSurname(user.getSurname().toUpperCase());
		copiaUser.setName(user.getName().substring(0, 1).toUpperCase()
				+ user.getName().substring(1, user.getName().length()).toLowerCase());
		// tenemos que encriptar la contraseña
		String encoded = new BCryptPasswordEncoder().encode(user.getPassword());
		copiaUser.setPassword(encoded);
		copiaUser.setConfirmPassword(encoded);
		userDao.save(copiaUser);

	}

	@Override
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
	public void deleteUser(String username) {
		userDao.delete(username);
	}

	@Override
	@Transactional
	public void deleteBook(long id) {
		bookDao.delete(id);
	}

	@Override
	@Transactional
	public User getUser(String username) {
		User user = userDao.get(username);
		return user;
	}

//	@Override
//	@Transactional
//	public boolean confirmExisting(String email) {
//		boolean exist = userDao.confirmExisting(email);
//		return exist;
//	}

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
	public void loanBooks(User user) {

		userDao.loanBooks(user);

	}

	@Override
	@Transactional
	public void save(Role role) {
		roleDao.save(role);

	}

}
