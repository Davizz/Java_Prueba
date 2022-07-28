package com.ludo.spring.javaapplication;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ludo.spring.config.HibernateUtil;

public class MainSelect {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		
		try {		

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
