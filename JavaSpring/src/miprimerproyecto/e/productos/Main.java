package miprimerproyecto.e.productos;

import miprimerproyecto.e.productos.TiposEnumerados.Tallas;

public class Main {

	public static void main(String[] args) {

		System.out.println("*****************4**************");
		// 4
		// Instancia una clase
		Producto chocolate = new Producto();

		System.out.println("*****************5**************");
		// 5
		// Ejemplar la clase se puede entender como
		// dar valor a cada una de las variables que
		// le componen y no limitarse a usar un constructor por defecto
		// chocolate es un objeto de la clase Producto
		Producto chocolateBlanco = new Producto(1, "Chocolate blanco", 3);

		// 6
		System.out.println("*****************6**************");
		// chocolate y chocolateBlanco son dos objetos distintos.
		// cada uno ocupa un espacio en la memoria
		// heredan de los métodos de la clase Object
		// Lo que hace que podemos acceder a los métodos de la
		// clase Object
		System.out.println(chocolate.equals(chocolateBlanco));
		System.out.println(chocolate.toString());
		System.out.println(chocolateBlanco.toString());
		// Más adelante, veremos que nosotros también podemos
		// crear una herencia de la clase producto.

		// 8
		System.out.println("*****************8**************");
		Producto chocolateNegro1 = new Producto(2, 3.25);
		Producto chocolateNegro2 = new Producto(3, 2.99);

		// 9
		// ACCEDER A LAS PROPIEDADES
		// NOMENTACLURA DEL PUNTO
		System.out.println("*****************9**************");
		System.out.println(chocolate.nombre);

		System.out.println("****************10**************");
		// 10
		// Poner todos los productos en un array de productos
		// Acceder a las propiedades del objeto
		Producto productos[] = { chocolate, chocolateBlanco, chocolateNegro1, chocolateNegro2 };
		for (Producto p : productos) {
			System.out.printf("ID: %d%nNombre: %s%nPrecio: %.2f%n", p.id, p.nombre, p.precio);
			// 12
			if (p.determinarCalidad("blanco")) {
				System.out.println("No me gusta");
			} else {
				System.out.println("Me encanta");
			}
			// 13
			// También por supuesto, podemos utilizar los métodos disponibles en la API
			System.out.printf("Uso de un método de la clase String: longitud %d%n", p.nombre.length());
			System.out.printf("Uso de la clase Math: potencia %f%n", Math.pow(p.precio, 2));
		}
		
		//11 TIPO ENUMERADOS
		Ropa prenda1 = new Ropa(Tallas.CHIQUITIN, "Vestido azul", 150.00);
		
		Ropa prenda = new Ropa(Tallas.GRANDE, "Ropa bonita",156.00 );
	System.out.println(prenda1);
	System.out.println(prenda.getTalla());
	

	}

}
