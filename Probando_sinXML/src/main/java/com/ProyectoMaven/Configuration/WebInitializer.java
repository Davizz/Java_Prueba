package com.ProyectoMaven.Configuration;

import java.lang.annotation.Annotation;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer{

	//1- Implementar la interfaz WebApplicationInitializer
	//2- Sobreescribir los métodos del WebApplicationInitializer
	//3  -Aparece el método OnStartup
	//4- Creamos un contexto
	//5-Configuramos el contexto
	
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
	AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
	contexto.register(WebConfig.class);	
	contexto.setServletContext(servletContext);
	ServletRegistration.Dynamic servlet = 
			servletContext.addServlet("springDispatcheServlet", new DispatcherServlet(contexto)); 
	
	//Indica el orden de carga de este método
	servlet.setLoadOnStartup(1);
	
	// Indica donde está la portada de la web
	servlet.addMapping("/");
	
	}
	

}
