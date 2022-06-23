package com.ludo.bdd.crud.relation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.BookDetails;
import com.ludo.bdd.crud.model.Category;
import com.ludo.bdd.crud.model.User;
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

			//GUARDAMOS LOS DATOS EN LA BASE
			OneToOne.executeRelation1To1(session);
			OneToMany.executeRelation1ToMany(session);
			//ManyToMany.executeRelationManyToMany(session);
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
