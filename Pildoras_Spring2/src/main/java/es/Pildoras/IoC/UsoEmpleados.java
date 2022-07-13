package es.Pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		// Creaci�n objetos sin interfaz

		Jefe Empleado1 = new Jefe();
		
		// Creaci�n objetos con interfaz
		
		Empleados Empleado2 = new Jefe();
		
		
		//Voy a crear un secretario
		Empleados Empleado3 = new Secretaria();
		
		//Voy a crear un director
		Empleados Empleado4 = new Director();
		
		// Uso objetos
		
		/*System.out.println(Empleado1.getTareas());
		System.out.println(Empleado2.getTareas());
		System.out.println(Empleado3.getTareas());
		System.out.println(Empleado4.getTareas());*/
		
		//Método 2
		//Cargo el archivo XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("pom_vacio.xml");
		
		//Pido el bean
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		//Utilizo el bean
		System.out.println(Juan.getTareas());
		
		//Cierro el bean
		contexto.close();
		
	}

}
