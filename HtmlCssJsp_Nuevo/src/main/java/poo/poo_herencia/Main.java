package poo.poo_herencia;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("/poo.xml");
				
		Persona pascal = context.getBean("pascal", Persona.class);
		System.out.println(pascal);	
		Persona eric = context.getBean("eric", Persona.class);
		System.out.println(eric);	
		
		context.close();
	}

}
