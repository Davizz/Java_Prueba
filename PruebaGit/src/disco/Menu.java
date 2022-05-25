package disco;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;






	
	
	public class Menu {
		private static int salir = -1;
		private static String msj = "";
		private ArrayList<Disco> productos;
//		private ArrayList<DiscoComprado> misProductos;
		private ArrayList<String> acciones;
//		private DiscoComprado comprando = null;
		private String accion;
		private double costeFinal;
		private int cantidad;

		public Menu() {

			// Creo los productos de la tienda
			Disco disco1 = new Disco ("Bon jovi","Jovi", 10, 15);
			Disco disco2 = new Disco ("Gunsn roses","Axel", 10, 14);
			
			ArrayList<Disco> tienda = new ArrayList<Disco>(Arrays.asList(disco1, disco2));

			// Introduzco los productos en el array Tienda
			
			this.productos = new ArrayList<Disco>(Arrays.asList(disco1, disco2));

			// Creo el array de productos que voy a comprar
//			this.misProductos = new ArrayList<ProductoComprado>();

//			System.out.println(p1);
//			System.out.println(p2);

			// Llamo a la posición 0 del array Tienda
			System.out.println(tienda.get(0));
			// Llamo a la posición 1 del array Tienda
			System.out.println(tienda.get(1));

			/*
			 * El usuario podrá desde el Menú realizar las acciones siguientes: - Consultar
			 * la lista de productos - Añadir 1 producto en varios ejemplares a su Cesta de
			 * la compra - Pasar a caja (disponible una vez creada la cesta de compra) -
			 * Salir de la aplicación
			 */

			// Creo un cuadro de menú con las opciones que voy a dar al usuario (SELECT)
			System.out.println(productos.get(1));
			this.acciones = new ArrayList<String>(Arrays.asList("1: Consultar la lista de productos",
					"2: Añadir 1 producto a la cesta", "3: Pasar por caja", "4: Devolver un producto", 
					"5: Cambiar el precio de un producto", "6: Salir de la aplicación"));

			while (salir != 1) {
				msj = "";

				try {
					// Defino las opciones del selector
					accion = (JOptionPane.showInputDialog(null, "Qué quieres hacer?", "Acción a realizar",
							JOptionPane.QUESTION_MESSAGE, null, acciones.toArray(), "Selecciona")).toString();

				} catch (NullPointerException e) {
					salir = 1;
					break;
				}

//				// Posibilidad 1 - Consultar la lista de productos del array PRODUCTO
				if (accion.charAt(0) == '1') 
				{
					// 1: Consultar la lista de productos
				
//
					for (Disco producto : tienda) {
						msj += producto.toString();
					}
					JOptionPane.showMessageDialog(null, msj, "Listado de productos", JOptionPane.INFORMATION_MESSAGE);
				
//					// Posibilidad 2 - Elegir producto del array PRODUCTO y cantidad (Añadir
//					// productos a la cesta)
				}}}}