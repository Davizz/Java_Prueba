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

			//GUARDAMOS LOS DATOS EN LA BASE
//			ExecuteRel1To1.execute1To1(session);
//			ExecuteRel1ToMany.execute1ToMany(session); 
//			ExecuteManyToMany.executeManyToMany(session); 
		
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
