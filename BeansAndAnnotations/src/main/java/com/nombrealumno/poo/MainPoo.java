package com.nombrealumno.poo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPoo {

	public static void main(String[] args) {
		
//		Coche miCoche = new Coche("Negro", "Pontiac", "Trans-Am"); 
//		System.out.println(miCoche); 
//		System.out.println(miCoche.getDescripcion());
//		System.out.println("**********************"); 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("poo.xml");
		Coche miCoche = context.getBean("miCoche", Coche.class);
		System.out.println(miCoche);
		System.out.println(miCoche.getDescripcion());
		context.close();

	}

}
