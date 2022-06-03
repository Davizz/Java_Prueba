package miprimerproyecto.f.ej17;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
//import formateando.*;

public class Menu {

	private static int salir = -1;
	private static String msj = "";
	private ArrayList<ProductoDisponible> productos;
	private ArrayList<ProductoComprado> misProductos;
	private ArrayList<String> acciones;
	private ProductoComprado comprando = null;
	private String accion;
	private double costeFinal;
	private int cantidad;

	public Menu() {

		ProductoDisponible pantalonVaquero = new ProductoDisponible("Pantalon vaquero", 89.99, 21);
		ProductoDisponible camisetaBlanca = new ProductoDisponible("Camiseta blanca", 65.99, 21);
		ProductoDisponible camisetaNegra = new ProductoDisponible("Camiseta negra", 65.99, 21);
		ProductoDisponible pantalonClasico = new ProductoDisponible("Pantalon clásico", 50.99, 21);
		ProductoDisponible pantalonGris = new ProductoDisponible("Pantalon gris", 74.99, 21);
		ProductoDisponible vestidoBlanco = new ProductoDisponible("Vestido blanco", 150.99, 21);
		ProductoDisponible vestidoRosa = new ProductoDisponible("Vestido rosa", 150.99, 21);
		ProductoDisponible vestidoBoda = new ProductoDisponible("Vestido de boda", 350.99, 21);
		ProductoDisponible vestidoNegro = new ProductoDisponible("Vestido negro", 250.99, 21);
		ProductoDisponible ChandalDeporte = new ProductoDisponible("Chandal de deporte", 149.99, 21);
		this.productos = new ArrayList<ProductoDisponible>(Arrays.asList(pantalonVaquero, camisetaBlanca, camisetaNegra,
				pantalonClasico, pantalonGris, vestidoBlanco, vestidoRosa, vestidoBoda, vestidoNegro, ChandalDeporte));
		this.misProductos = new ArrayList<ProductoComprado>();

		/*
		 * El usuario podrá desde el Menú realizar las acciones siguientes: - Consultar
		 * la lista de productos - Añadir 1 producto en varios ejemplares a su Cesta de
		 * la compra - Pasar a caja (disponible una vez creada la cesta de compra) -
		 * Salir de la aplicación
		 */

		System.out.println(productos.get(1));
		this.acciones = new ArrayList<String>(Arrays.asList("1: Consultar la lista de productos",
				"2: Añadir 1 producto a la cesta", "3: Pasar por caja", "4: Salir de la aplicación"));

		while (salir != 1) {
			msj = "";

			try {
				accion = (JOptionPane.showInputDialog(null, "Qué quieres hacer?", "Acción a realizar",
						JOptionPane.QUESTION_MESSAGE, null, acciones.toArray(), "Selecciona")).toString();

			} catch (NullPointerException e) {
				salir = 1;
				break;
			}

			if (accion.charAt(0) == '1') {// 1: Consultar la lista de productos

				for (ProductoDisponible producto : productos) {
					msj += producto.toString();
				}
				JOptionPane.showMessageDialog(null, msj, "Listado de productos", JOptionPane.INFORMATION_MESSAGE);

			} else if (accion.charAt(0) == '2') {// 2: Añadir 1 producto a la cesta
				/*
				 * La cesta es un array de productos (o una lista). Una vez añadidos productos
				 * en la cesta de la compra, el usuario puede pasar a caja.
				 * 
				 */

				do {
					String producto = (JOptionPane.showInputDialog(null, "Escoje un producto", "Productos disponibles",
							JOptionPane.QUESTION_MESSAGE, null, productos.toArray(), "Selecciona")).toString();

					int id = (producto.charAt(0) == 1 ? (producto.charAt(1) == 0 ? 10 : 1)
							: Integer.parseInt(producto.substring(0, 1)));
					// System.out.println(id);
					try {
						cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad deseada"));
						ProductoDisponible miProducto = productos.get(id);
						comprando = new ProductoComprado(miProducto, cantidad);
						misProductos.add(comprando);

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
								JOptionPane.YES_NO_OPTION );
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

					} catch (NullPointerException e) {
						salir = 1;
						break;
					}
				}
			} else { // 4: Salir de la aplicación
				// no quiere seguir haciendo cosas
				salir = 1;
			}
		}
	}
}
