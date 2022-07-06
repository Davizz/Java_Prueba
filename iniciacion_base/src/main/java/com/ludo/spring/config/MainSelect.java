package com.ludo.spring.config;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ludo.spring.config.HibernateUtil;

public class MainSelect {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		// EN UN TRY CATCH FINALLY
		try {

			/* PARTE QUE ESTABA EN EL MÉTODO LIST DEL BOOKDAOIMPL */

			// Con el fin de utilizar la referencia book en minusculas
			// en otra parte de la petición
			// superior a un determinado año y usando "as book"
			// sentencia = "from Book as book where
			// book.bookDetails.publication_year>:year";
			// System.out.println(sentencia);
			// query = sessionFactory.getCurrentSession().createQuery(sentencia);
			// query.setParameter("year", 1880);
			// y inferior a usando Book book que es lo mismo que as book

//			sentencia = "from Book book where book.bookDetails.publication_year < :year";
//			System.out.println(sentencia);	
//			query = sessionFactory.getCurrentSession().createQuery(sentencia);
//			query.setParameter("year", 1880);

			// Que empieza por: Les

//			sentencia = "from Book book where book.title like :cadena ";
//			System.out.println(sentencia);	
//			query = sessionFactory.getCurrentSession().createQuery(sentencia);
//			query.setParameter("cadena", "Les%");

			// Que acaba por: es

//			sentencia = "from Book book where book.title like :cadena ";
//			System.out.println(sentencia);	
//			query = sessionFactory.getCurrentSession().createQuery(sentencia);
//			query.setParameter("cadena", "%es");

			// Que contenga las letras "de"

//			sentencia = "from Book book where book.title like :cadena ";
//			System.out.println(sentencia);	
//			query = sessionFactory.getCurrentSession().createQuery(sentencia);
//			query.setParameter("cadena", "%de%");

			// Estrictamente igual a
			// sentencia = "from Book book where book.author=:name ";
			// System.out.println(sentencia);
			// query = sessionFactory.getCurrentSession().createQuery(sentencia);
			// query.setParameter("name", "François Rabelais");

			// ABRIMOS SESIÓN
			session = HibernateUtil.getSessionFactory().openSession();
			// OBTENEMOS LOS DATOS DE LA TRANSACCIÓN
			transaction = session.beginTransaction();
		
			

			session.getTransaction().commit();
		} catch (Exception e) {
			if (transaction != null) {
				System.out.println("Consulta imposible.");
				// ALGO HA IDO MAL! HACEMOS UN ROOLBACK (ANULAMOS)
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				// CERRAMOS SESIÓN
				session.close();
			}
		}
		// DESACTIVAMOS NUESTRO OBJETO HIBERNATEUTIL
		HibernateUtil.shutdown();
	}

	

}
