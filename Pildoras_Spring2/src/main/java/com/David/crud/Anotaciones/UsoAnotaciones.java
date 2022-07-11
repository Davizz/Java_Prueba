package com.David.crud.Anotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("pom.xml");
		
		Empleados Antonio = contexto.getBean("ComercialAnotacion", Empleados.class);
	
		System.out.println(Antonio.getInforme());
		
		contexto.close();
	}

}
