package com.ludo.bdd.crud.relation;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.ludo.bdd.crud.config.HibernateUtil;

public class MainPruebas {
	
	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		// EN UN TRY CATCH FINALLY
		try {
			// ABRIMOS SESIÓN
			session = HibernateUtil.getSessionFactory().openSession();
			//OBTENEMOS LOS DATOS DE LA TRANSACCIÓN
			transaction = session.getTransaction();
			//INICIALIZAMOS EL PROCESO
			transaction.begin();			
			/*	inicio pruebas	*/
//			1.	Todos los autores
			//SentenciasHQL.imprimeAutores(session);			
//			2.	Los autores provenientes de USA
			//SentenciasHQL.imprimeAutoresByCountry(session, "USA");	
//			3.	Los libros que empiezan por The
			//SentenciasHQL.imprimeLibrosCuyoTituloContieneCadena(session, "Pr%");
//			4.	Los libros que contienen la letra c
			//SentenciasHQL.imprimeLibrosCuyoTituloContieneCadena(session, "%P%");
//			5.	Los libros anteriores a 2010
			//SentenciasHQL.imprimeLibrosSegunYear(session, 2010);
//			6.	Los libros escritos por J.D. Salinger
			//SentenciasHQL.imprimeLibrosSegunAuthor(session, "J.D. Salinger");	
//			7.	El número de libros
			//NO ADMITE INT COMO TIPO DE DATO
			//long countLibros = (long)session.createQuery("select count(b.title) from Book b").uniqueResult();
			//System.out.println(countLibros + " libros");			
			//8.	Los libros más antiguos
			//SentenciasHQL.imprimeLibrosSegunYear(session);
//			9.	El número total de páginas de nuestros libros
			long numPages = (long)session.createQuery("select sum(b.num_page) from Book b").uniqueResult();
			System.out.println(numPages + " páginas totales");	
//			10.	El número de páginas escritas por F. Scott. Fitzgerald
			long numPagesSegunAuthor = (long)session.createQuery("select sum(b.num_page) from Book b where b.author.name = :author").setParameter("author", "F. Scott. Fitzgerald").uniqueResult();
			System.out.println(numPagesSegunAuthor + " páginas totales en los libros escritos por F. Scott. Fitzgerald");	

			/* final pruebas	*/
			//CONFIRMAMOS LA OPERACIÓN
			transaction.commit();
			//SACAMOS INFORMACIÓN POR CONSOLA
			System.out.println("Registros guardados con éxito");

		} catch (Exception e) {
			if (transaction != null) {
				System.out.println("Transacción anulada.");
				//ALGO HA IDO MAL! HACEMOS UN ROOLBACK (ANULAMOS)
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
