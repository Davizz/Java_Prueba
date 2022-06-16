package com.ProyectoMaven.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ProyectoMaven.Controler.MainController;

@Configuration
@EnableWebMvc

public class WebConfig implements WebMvcConfigurer {

	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

		
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public MainController myMvcController() {
		return new MainController();
	}
	
}

/*
 * Equivalente a...
 * 
 * <bean
 * class="org.springframework.web.servlet.view.InternalResourceViewResolver">
 * <property name="prefix" value="/WEB-INF/view/" /> <property name="suffix"
 * value=".jsp" /> </bean>
 */
