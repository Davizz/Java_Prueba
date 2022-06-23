package com.nombrealumno.poo.poo_anotaciones;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLibro {

	/* __Fase_X000__ --> ANOTACIONES */
	/* __Fase_X001__--> IMPRIMIBLE */
	/* __Fase_X002__--> LIBRO + ciclo de vida + procesar*/
	/* __Fase_X003__Y __Fase_X004--> MAIN */
	/* __Fase_X005__ Y __Fase_X006__--> CONFIG */
	/* __Fase_X007__Y __Fase_X008--> LIBRO */
	/* __Fase_X010--> LIBRO */
	/* __Fase_X011__Y __Fase_X012--> MAIN */
	/* __Fase_X013--> LIBRO */
	/* __Fase_X014--> CONFIG */
	/* __Fase_X015__Y __Fase_X016--> MAIN */
	/* __Fase_X017__--> VENDIBLE */
	/* __Fase_X018__--> DISPONIBLE */
	/* __Fase_X019__--> LIBRO */
	/* __Fase_X020__--> MAIN */
	/* __Fase_X021__--> NODISPONIBLE */
	/* __Fase_X022__--> MAIN */
	/* __Fase_X023__--> ESTADISTICAS */
	/* __Fase_X024__--> ESTADISTICAS LIBROS */
	/* __Fase_X025__--> LIBRO */
	/* __Fase_X026__--> MAIN */
	/* __Fase_X027__--> CONTROLLER */
	/* __Fase_X028__--> JSP FILE */
	/* __Fase_X029__--> NAVBAR */
	public static void main(String[] args) {

		/* __Fase_003__--> LISTA Y PROCESAR */

		List<Object> lista = new ArrayList<Object>();
		lista.add(new Libro("20000 leguas de viaje submarino", "Julio Verne"));
		lista.add(new Libro("Los miserables", "Victor Hugo"));
		Libro.procesar(lista);

		/*
		 * __Fase_004__ -> CLASE ANNOTATIONCONFIGAPPLICATIONCONTEXT CON CONFIG NO
		 * OLVIDAR CERRAR EL CONTEXTO CON context.close();
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		/* __Fase_011__ -> PROBAR CON UN LIBRO */
		Libro aventuras1 = context.getBean("libro", Libro.class);
		System.out.println(aventuras1);
		/* __Fase_012__ -> ALCANCE DE UN BEAN */
		/* __Fase_015__ -> PROBAR CON OTRO LIBRO */
		Libro aventuras2 = context.getBean("libro", Libro.class);
		System.out.println(aventuras2);
		/* __Fase_016__ -> COMPARAR LIBROS */
		System.out.println("Son iguales los beans??? :" + (aventuras1 == aventuras2));

		/* __Fase_020__ VENTA */
		aventuras1.realizaVenta();

		/* __Fase_026__ ESTADISTICAS COMPLETAS */
		if (aventuras1.getEstadisticas().getAccesoDatos()) {
			System.out.println("Tipo ventas: " + aventuras1.getEstadisticas().getTipoVentas());
			System.out.println("Ventas totales: " + aventuras1.getEstadisticas().getVentasTotales());
			System.out.println("Ganancias totales: " + aventuras1.getEstadisticas().getGananciasTotales());
			System.out.println("IVA aplicado : " + aventuras1.getEstadisticas().getIva());
			

			/* ... */
		}
		context.close();

	}

	
	

}
