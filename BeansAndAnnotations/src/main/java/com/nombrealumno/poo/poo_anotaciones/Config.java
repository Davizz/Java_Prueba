package com.nombrealumno.poo.poo_anotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * __Fase_005__ -> Para que Spring Framework cargue los beans vía anotaciones,
 * debemos indicarle los paquetes que tiene que escanear Esto lo hacemos con
 * 
 * @Configuration
 * 
 * @ComponentScan("com.nombrealumno.poo.poo_anotaciones") public class
 * ApplicationConfiguration { // ... } __ *
 * 
 * Es una anotación que tiene nivel de clase. Muy importante. 
 * La clase anotada con esta anotación
 * puede estar compuesta por métodos anotados con @Bean. 
 * Un @Bean es básicamente uno de los objetos que utilizá nuestra aplicación
 * El contenedor de Spring invocará estos métodos para obtener 
 * las instancias de objetos.
 * 
 * @Configuration classes no son más que fábricas administradas 
 * de Spring para crear y registrar instancias Bean. 
 * 
 * @ComponentScan es una anotación que pide a Spring que escanee 
 * los contenidos del paquete pasado por parametro. 
 * Es otra forma de crear nuevos BEANS. Pero esta vez, 
 * es Spring él que los maneja.
 * 
 **/

@Configuration
//@EnableWebMvc
@ComponentScan("com.nombrealumno.poo.poo_anotaciones")
public class Config /* implements WebMvcConfigurer */ {
	
	/*__Fase_006__ -> CREACIÓN OBJETO LIBRO*/	
	/**
	 * Como lo he dicho antes, la configuración de un Bean 
	 * se puede realizar de dos formas distintas:
	 * XML o Anotación. Ahora estamos viendo como hacerlo con 
	 * anotaciones.
	 * UNA ANOTACIÓN BEAN TIENE QUE LLEVAR A OTRA ANOTACIÓN COMPONENT
	 * AQUÍ EL BEAN LLEVA A LA CLASE LIBRO 
	 * 
	 * * definiendo el Bean para el telefono y la inyección de dependencias: La
	 * inyección de un Bean en otro bean se puede hacer de 3 formas: usando un
	 * constructor (la recomendada), usando un campo: la propiedad de una interfaz
	 * (un clásico), usando un setter (la más antigua) o usando un getter.
	 * COMO LO HAREMOS EN LOS PUNTOS 19 A 22
	 * 
	 * 	 * 
	 */	
	@Bean
	//@Scope("prototype") /*__Fase_014__ -> PROBAR */
	public Libro libro() {
		 // Inicializa, configura y devuelve una instancia de Libro
		//equivalente a <bean name="libro" class="com.nombrealumno.poo.Libro"/>
		return new Libro("20000 leguas de viaje submarino", "Julio Verne", "aventuras");
	}	

	@Bean
	public Estadisticas estadisticasLibros() { // ID de BEAN
		double ventasTotales = 112; 
		String tipoVentas = "CB"; 
		double gananciasTotales = 1456;
		double iVA = 4;
		boolean accesoDatos = true; 
		return new EstadisticasLibros(ventasTotales, tipoVentas, gananciasTotales, iVA, accesoDatos);
	}			
	
	/*
	 * @Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
	 * registry .addResourceHandler("/resources/**")
	 * .addResourceLocations("/resources/"); }
	 */

	/**
	 * Aquí estoy definiendo el Bean para el juego CandyCrush Un bean puede ser
	 * definido anotando un método con @Bean. Este método devolverá la instancia del
	 * Bean.
	 */
	@Bean
	public Internet tipoConecciones() { // ID de BEAN
		return new CincoG();
	}

	/**
	 * Aquí estoy definiendo el Bean para la conexión con la 5G. Un bean puede ser
	 * declarado anotando una clase con @Component o una de las 3 anotaciones de
	 * stereotipo asociados.
	 * 
	 * @Controller declara un bean Web, es una capa de presentación la usamos en el
	 *             controlador.
	 * @Service declara un bean de servicio, es una capa de negocio, gestiona la
	 *          logica de la aplicacion. Es dónde se indica qué es lo que se debe
	 *          hacer con los datos. *
	 * @Repository declara un bean DAO, una capa persistante de datos
	 */
	@Bean
	public Juegos tieneJuegos() { // ID de BEAN
		return new CandyCrush();
	}

	/**
	 * * Para utilizar una inyección por constructor, el Bean principal aquí
	 * samsung() debe de tener un constructor con un argumento que corresponde al
	 * bean que vamos a inyectar. Aquí tipoConecciones y tieneJuegos
	 * 
	 * @return {@link Samsung}
	 * 
	 */
	//
	@Bean
	public Samsung samsung() {
		return new Samsung("A52s", "Samsung", 648741741, tipoConecciones(), tieneJuegos());
	}

	


}
