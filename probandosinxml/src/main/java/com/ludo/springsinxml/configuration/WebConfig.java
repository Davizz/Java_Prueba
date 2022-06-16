package com.ludo.springsinxml.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ludo.springsinxml.controllers.MainController;
import com.ludo.springsinxml.controllers.UserController;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {	
	/**
	 * ViewResolver es una interfaz cuya implementación es responsable de resolver
	 * las vistas por nombre. La configuramos como un BEAN
	 * 
	 * No tenemos que implementarlo nosotros mismos, ya que exiten muchas clases
	 * encargadas de crear estas vistas.
	 * 
	 * Uno de los solucionadores de vista comúnmente utilizados es
	 * InternalResourceViewResolver, su vista predeterminada es JstlView, que se
	 * puede cambiar.
	 * 
	 * Podemos tener múltiples clases encargadas de resolver vistas
	 * 
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver() {		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		/*
		 * Según esta configuración, los recursos de Jstl deben estar ubicados en el
		 * directorio /WEB-INF/view/ y deben tener la extensión de archivo de jsp.
		 */
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");		
		return viewResolver;				
	/*
	 *  <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/view/" />
        <property name="suffix" value=".jsp" />
    </bean>
	 */				
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	/**
	 * Debemos registrar los controladores como BEAN (ya sea mediante el escaneo de
	 * Spring con @ComponentScan(RUTA_HACIA_PAQUETES_IMPORTANTES) o los métodos
	 * explícitos de fábrica @Bean):
	 * 
	 * @return
	 */
	@Bean
	public MainController myMvcController() {
		return new MainController();
	}
	
	@Bean
	public UserController myUserController() {
		return new UserController();
	}
	
	
	
	
	
	
	/*
	
		<!--  Añadiendo recursos externos como img, css y js -->
	<mvc:resources location="/resources/" mapping="/resources/**"></mvc:resources>

	
	*/
}
