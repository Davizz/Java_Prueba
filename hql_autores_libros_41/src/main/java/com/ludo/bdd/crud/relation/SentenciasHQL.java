package com.ludo.bdd.crud.relation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ludo.bdd.crud.model.Author;
import com.ludo.bdd.crud.model.Book;

public class SentenciasHQL {
	
	static Query<?> consulta = null; 
	static List<?> lista = null; 

	public static void imprimeAutores(Session session) {
		consulta = session.createQuery("from Author"); 
		lista = consulta.list();
		listaAutores(); 		
	}
	
	public static void imprimeAutoresByCountry(Session session, String cadena) {
		consulta = session.createQuery("from Author a where a.country = :cadena ORDER BY a.name")
				.setParameter("cadena", cadena); 
		lista = consulta.list();
		listaAutores(); 			
	}
	
	public static void imprimeLibrosCuyoTituloContieneCadena(Session session, String cadena) {		
		consulta = session.createQuery("from Book b where b.title LIKE :cadena ORDER BY b.title")
				.setParameter("cadena", cadena); 
		lista = consulta.list();
		listaLibros(); 
	}
	
	public static void imprimeLibrosSegunYear(Session session, int year) {
		consulta = session.createQuery("from Book b where b.year < :year ORDER BY b.title")
				.setParameter("year", year); 
		lista = consulta.list();
		listaLibros(); 
	}
	
	public static void imprimeLibrosSegunAuthor(Session session, String cadena) {
		consulta = session.createQuery("from Book b where b.author.name = :cadena ORDER BY b.title")
				.setParameter("cadena", cadena); 
		lista = consulta.list();
		listaLibros(); 			
	}
	
	public static void imprimeLibrosSegunYear(Session session) {
		consulta = session.createQuery("from Book b where b.year = (select min(b.year) From Book b) ORDER BY b.title"); 
		lista = consulta.list();
		listaLibros(); 	
	}
	


	
	
	
	
	
	private static void listaAutores() {		
		for(Iterator<?> iterator = lista.iterator(); iterator.hasNext();) {
			Author author = (Author) iterator.next(); 
			
			System.out.println("");
			System.out.println("ID: " + author.getId());
			System.out.println("NOMBRE: " + author.getName());
			System.out.println("PAÍS: " + author.getCountry());
			System.out.println("");
		}		
	}
	
	private static void listaLibros() {		
		for(Iterator<?> iterator = lista.iterator(); iterator.hasNext();) {
			Book libro = (Book) iterator.next(); 
			
			System.out.println("");
			System.out.println("ID: " + libro.getId());
			System.out.println("TÍTULO: " + libro.getTitle());
			System.out.println("NÚMERO DE PÁGINAS: " + libro.getNum_page());
			System.out.println("");
		}		
	}

}
