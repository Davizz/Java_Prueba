package com.ludo.bdd.crud.relation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ludo.bdd.crud.model.Provider;
import com.ludo.bdd.crud.model.ProviderDetail;

public class ExecuteRel1To1 {

	
	public static void execute1To1(Session session) {
		
		Provider provider = new Provider(); 
		provider.setName("Ferretería Cubas");
		provider.setEmail("ventas@ferreteriacubas.com");
		provider.setPhone_number(942789789);
		
		ProviderDetail pd = new ProviderDetail(); 		
		pd.setCity("Cudón");
		pd.setPersonContact("Ernesto");
		
		pd.setProvider(provider);
		provider.setProviderDetail(pd);
		
		session.persist(provider);
		
		
		
		
	}
}
