package F17;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

//import miprimerproyecto.f.ej17.ProductoDisponible;

public class Menu {
	private static int salir = -1;
	private static String msj = "";
	private ArrayList<Producto> productos;
	private ArrayList<ProductoComprado> misProductos;
	private ArrayList<String> acciones;
	private ProductoComprado comprando = null;
	private String accion;
	private double costeFinal;
	private int cantidad;

	public Menu() {

		// Creo los productos de la tienda
		Producto p1 = new Producto("Pantalón", 2, 25);
		Producto p2 = new Producto("Camisa", 4, 32);

		// Introduzco los productos en el array Tienda
		ArrayList<Producto> tienda = new ArrayList<Producto>(Arrays.asList(p1, p2));
		this.productos = new ArrayList<Producto>(Arrays.asList(p1, p2));

		// Creo el array de productos que voy a comprar
		this.misProductos = new ArrayList<ProductoComprado>();

//		System.out.println(p1);
//		System.out.println(p2);

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
				"2: Añadir 1 producto a la cesta", "3: Pasar por caja", "4: Salir de la aplicación"));

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

			// Posibilidad 1 - Consultar la lista de productos del array PRODUCTO
			if (accion.charAt(0) == '1') {// 1: Consultar la lista de productos

				for (Producto producto : productos) {
					msj += producto.toString();
				}
				JOptionPane.showMessageDialog(null, msj, "Listado de productos", JOptionPane.INFORMATION_MESSAGE);

				// Posibilidad 2 - Elegir producto del array PRODUCTO y cantidad (Añadir
				// productos a la cesta)
			} else if (accion.charAt(0) == '2') {
				/*
				 * La cesta es un array de productos (o una lista). Una vez añadidos productos
				 * en la cesta de la compra, el usuario puede pasar a caja.
				 * 
				 */

				do {
					
					//Solicitud de producto
					String producto = (JOptionPane.showInputDialog(null, "Escoje un producto", "Productos disponibles",
							JOptionPane.QUESTION_MESSAGE, null, productos.toArray(), "Selecciona")).toString();
					
					
					//Defino la variable que voy a asociar a la cantidad
					int id = (producto.charAt(0) == 1 ? (producto.charAt(1) == 0 ? 10 : 1)
							: Integer.parseInt(producto.substring(0, 1)));
					
					try {
						//Solicitud de cantidad (
						cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad deseada"));
						Producto miProducto = productos.get(id);
						//Aquí ESTA EL FALLO
						comprando = new ProductoComprado(miProducto, cantidad);
						misProductos.add(comprando);
						
						System.out.print(comprando.cantidad);

					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Formato no permitido");

					}

				} while (cantidad < 1);
				cantidad = 0;
			} else if (accion.charAt(0) == '3') {// 3: Pasar a caja
				if (comprando == null) {
					JOptionPane.showMessageDialog(null, "Cesta vacia");

				} else {

					msj = "Has deseado comprar \n";
					msj += "Nombre producto------------------Precio------------------CANTIDAD------------------IVA------------------Precio Total\n";
					for (ProductoComprado producto : misProductos) {
						msj += producto.toString();
						costeFinal += producto.coste();
					}

//					msj += "Te costará " + Format.getPriceFormatted(costeFinal) + " €";
					msj += "Te costará " + costeFinal + " €";
					msj += "¿Estás de acuerdo?";

					try {
						int decision = JOptionPane.showConfirmDialog(null, msj, "Confirmar compra",
								JOptionPane.YES_NO_OPTION);
						if (decision == 0) {
							JOptionPane.showMessageDialog(null, "Muchas gracias por su compra", "Pedido cobrado",
									JOptionPane.WARNING_MESSAGE);
							System.exit(0);
						} else {
							misProductos = null;
							costeFinal = 0;
							JOptionPane.showMessageDialog(null, "Hemos anulado tu pedido", "Pedido anulado",
									JOptionPane.WARNING_MESSAGE);
						}

					} catch (NullPointerException e) {JOptionPane.showMessageDialog(null, "Acabas de salir de la aplicación.", "Error", JOptionPane.ERROR_MESSAGE);
					System.exit(-1);}
						salir = 1;
						break;
					}
				
			} else { // 4: Salir de la aplicación
				// no quiere seguir haciendo cosas
				salir = 1;
			}}}}
		
	

