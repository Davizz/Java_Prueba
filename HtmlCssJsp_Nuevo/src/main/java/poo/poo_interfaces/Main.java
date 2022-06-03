package poo.poo_interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		/*
		 * Esta parte es muy técnica Con Spring utilizamos las interfaces para inyectar
		 * características nuevas a objetos y a clase ya creados. A proyectos ya
		 * inicializados. Es práctico ya que simplifica la actualización de proyectos ya
		 * creados
		 * 
		 * Como se ve el el esquema, es a partir de la interfaz que Spring busca la
		 * clase que corresponde a lo que estamos queriendo inyectar. Paso a paso sería
		 * algo como 1) Aquí, el main apunta al fichero XML. 2) El XML nos indica el
		 * objeto que queremos utilizar -> poo_interfaces.Vendedor y 3) lo asocia a una
		 * id que será el nombre del objeto. -> michel 4) El objeto de la clase
		 * ClassPathXmlApplicationContext apunta al nombre michel y a la interfaz Tareas
		 * 5) En el fichero XML, las líneas <constructor-arg
		 * ref="tienda"></constructor-arg> o <property name="tienda"
		 * ref="tienda"></property> son muy importantes 6) Permiten inyectar contenidos
		 * nuevos en un objeto ya existante 7) Se pueden utilizar con un contructor o
		 * con un setter
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("poo.xml");
		Tareas michel = context.getBean("michel", Tareas.class);
		System.out.println(michel);

		Tareas annie = context.getBean("annie", Tareas.class);
		System.out.println(annie);

		context.close();

	}

}
