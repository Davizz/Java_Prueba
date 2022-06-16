package com.ludo.springsinxml.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Podemos registrar DispatcherServlet de forma programática o usar
 * web.xml en su lugar. Todo lo que tenemos que hacer es implementar
 * WebApplicationInitializer. * En la implementación de
 * WebApplicationInitializer registraremos DispatcherServlet y el contenedor
 * Spring, AnnotationConfigWebApplicationContext junto con el registro de la
 * clase anotada con @Configuration.
 */
public class WebInitializer implements WebApplicationInitializer {
	/**	
	 * La interfaz WebApplicationContext extiende ApplicationContext. Es una
	 * representación del contenedor IOC de SPRING. Además de manejar BEANS,
	 *  tiene la instancia de javax.servlet.ServletContext.
	 * 
	 * AnnotationConfigWebApplicationContext implementa AnnotationConfigRegistry
	 * también (al igual que AnnotationConfigApplicationContext), por lo que acepta
	 * clases anotadas como entrada, en particular la anotación @Configuration
	 */
	
	//1 implementar la interfaz WebApplicationInitializer
	//2 sobrescribir los métodos de WebApplicationInitializer 
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//3 aparece el método onStartup
		//4 creamos un contexto. 
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		//5configuramos el contexto indicandole el fichero de configuración dónde se encontrarán los
		//ficheros de tipo Controller...
		contexto.register(WebConfig.class);		
		contexto.setServletContext(servletContext);
		/*
		 * Estamos a punto de crear el controlador del FRONT. * Spring web MVC framework
		 * es diseñado entorno a DispatcherServlet.
		 * 
		 * ESTA IMAGEN NOS PUEDE SERVIR PARA ENTENDER EL PROCESO QUE SE ESTÁ EJECUTANDO
		 * https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/spring-mvc
		 * -intro/images/high-level.png
		 * 
		 * DispatcherServlet delega las solicitudes a los controladores en función del
		 * URI solicitado. Así es como funciona:
		 * 
		 * Cuando DispatcherServlet recibe una solicitud de cliente web, lo trasmite a
		 * uno de los controladores de nuestra aplicación según la URI transmitida. Esto
		 * hace que el servlet invoca el objeto HandlerMapping y el método del manejador
		 * apropiado. El servlet también prepara y pasa argumentos al método handler,
		 * incluyendo la instancia de org.springframework.ui.Model como argumento.
		 * 
		 * En este punto, el código específico de la aplicación se invoca en el método
		 * del controlador. El código es responsable de preparar el modelo (basado en la
		 * lógica de negocio) y normalmente devuelve el nombre de la vista al servlet.
		 * 
		 * Basado en el nombre de vista devuelto, el servlet localiza la vista sustituye
		 * los valores de atributo proporcionados por el modelo en la vista y luego
		 * devuelve eso al cliente como respuesta.
		 * 
		 */
		ServletRegistration.Dynamic servlet = 
				servletContext.addServlet("springDispatcherServlet", new DispatcherServlet(contexto));
		//Indica el orden de carga de este método
		servlet.setLoadOnStartup(1);
		//indicar dónde se encuentra la portada de la web
		servlet.addMapping("/");
		
		
		//equivalente a 
		
		/*
		
		<servlet>
		<servlet-name>springmvc</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	
		<load-on-startup>1</load-on-startup>
	</servlet>

	<!-- Ubicacion URL del servlet -->
	<servlet-mapping>
		<servlet-name>springmvc</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
		*/
		
	}

}
