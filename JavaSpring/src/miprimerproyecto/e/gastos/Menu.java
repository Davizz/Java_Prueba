package miprimerproyecto.e.gastos;

import java.text.DecimalFormat;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Menu {
	// 6 una serie de propiedades necesarias para
	// la ejecución del programa
	private static int salir = -1;
	private static String msj = "";
	private ArrayList<Gasto> gastos;
	private ArrayList<String> acciones;
	private String accion;
	private boolean primerGasto = false;
	private double costeCompra, gastosFinales;

	/**
	 * 7 creando el método que me saca la lista de compras realizadas LA DEJO
	 * COMENTADA EN GRAN PARTE CON ELEMENTOS QUE USE AL PRINCIPIO PARA REALIZAR
	 * PRUEBAS
	 * 
	 * @return
	 */
	public static ArrayList<Gasto> crearListaPrevia() {
		// ArrayList de compras
		ArrayList<Gasto> gastos = new ArrayList<Gasto>();
		Gasto gasto1 = new Gasto(Gasto.Categoria.COMPRA, 50, ZonedDateTime.now());
		Gasto gasto2 = new Gasto(Gasto.Categoria.PARKIN, 10, ZonedDateTime.now());
		Gasto gasto3 = new Gasto(Gasto.Categoria.RESTAU, 12, ZonedDateTime.now());
		Gasto gasto4 = new Gasto(Gasto.Categoria.COMPRA, 8, ZonedDateTime.now());
		gastos.add(gasto1);
		gastos.add(gasto2);
		gastos.add(gasto3);
		gastos.add(gasto4);
		for (Gasto gasto : gastos) {
			System.out.println(gasto);
		}
		return gastos;
		
		
	}

	/**
	 * 8 MÉTODO CONSTRUCTOR DE MI MENÚ
	 */
	public Menu() {
		// 9 INICIALIZACIÓN DE LA LISTA PREVIA Y DE LAS CATEGORIAS
		this.gastos = Menu.crearListaPrevia();
		String categorias[] = new String[Gasto.Categoria.values().length];
		int contador = 0;
		for (Gasto.Categoria c : Gasto.Categoria.values()) {
			categorias[contador] = c.getCategoria();
			contador++;
		}
		// 14 LAS ACCIONES DISPONIBLES DESDE EL PRINCIPIO
		// SOLO HAY DOS. PUES LAS DEMÁS TIENEN QUE VENIR DESPUÉS
		this.acciones = new ArrayList<String>(Arrays.asList("1: Registrar nuevo gasto", "2: Salir de la aplicación"));

		// 10 INICIALIZACIÓN DE LAS PROPIEDADES
		accion = "";
		costeCompra = 0;
		gastosFinales = 0;
		// 11 BUCLE QUE VA A CONTROLAR EL ESTADO DEL MENÚ
		while (salir != 1) {
			msj = "";
			// 12 SI LE DOY A CANCELAR, TRATO DE CAPTURAR LA EXCEPCIÓN
			// Y DE PARAR LA APLICACIÓN
			try {
				// 13 UN PANEL JOPTION PARA SABER QUÉ QUIERE HACER EL USUARIO
				accion = (JOptionPane.showInputDialog(null, "¿Qué quieres hacer?", "Acción a realizar",
						JOptionPane.INFORMATION_MESSAGE, null, acciones.toArray(), "Selecciona")).toString();
			} catch (NullPointerException e) {
				// 15 SI LE DAMOS A CANCELAR, QUIERO QUE SE SALGA DEL BUCLE SIN HACER PROBLEMAS
				salir = 1;
				break;
			}
			// 17 TRATAMIENTO DE LAS ELECCIONES DEL USUARIO
			// UN IF CON DOS ELSEIF Y EL ELSE FINAL
			// ESCRIBIMOS LA ESTRUCTURA DEL IF Y LUEGO LA
			// RELLENAREMOS

			if (accion.equals("1: Registrar nuevo gasto")) {
				// QUIERE AÑADIR UN GASTO
				// 24 UN DO WHILE
				do {
					// HARÁ POR LO MENOS UNA VEZ ALGO MIENTRAS EL COSTE
					// DE LA COMPRA NO ES MENOR DE 1
					// 25 QUÉ CATEGORIA ES?
					String titulo = (JOptionPane.showInputDialog(null, "¿En qué categoría lo pondremos?",
							"Tipo de gasto", JOptionPane.PLAIN_MESSAGE, null, categorias, "Selecciona")).toString();
					// 26 LA CAPTAMOS CON EL MÉTODO GETTITULO DEL PUNTO 5
					Gasto.Categoria categoria = Gasto.Categoria.getTitulo(titulo);
					// 27 UN TRY PARA QUE NO ME METAN LETRAS EN EL DOUBLE
					try {
						costeCompra = Double.parseDouble(JOptionPane.showInputDialog("Gasto realizado:"));
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Formato no permitido");
					}
					// 28 UN IF PARA COGER SOLO VALOR SUPERIORES A 0
					if (costeCompra > 0) {
						// 29 VALOR ADECUADO
						// SE CREAR UN GASTO
						Gasto nuevoGasto = new Gasto(categoria, costeCompra, ZonedDateTime.now());
						// 30 SE AÑADE EL GASTO A LA LISTA DE GASTOS
						gastos.add(nuevoGasto);
						// 31 SI, Y SOLO SI, ES EL PRIMER GASTO
						if (!primerGasto) {
							// 32 AÑADIMOS VER LOS GASTOS Y SUMAR GASTOS A LAS ACCIONES DISPONIBLES
							acciones.set(1, "4: Salir de la aplicación"); 
							acciones.add("2: Ver los gastos");
							acciones.add("3: Sumar gastos");							
							// 33 ORDENAMOS EL ARRAYLIST
							acciones.sort(null);
							//Collections.sort(acciones);
							// 34 INFORMAMOS QUE YA TENEMOS UN GASTO
							// PARA QUE NO VUELVA A AÑADIR ELEMENTOS EN EL ARRAYLIST DE ACCIONES
							primerGasto = true;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Solo gastos superiores a 0");
					}
				} while (costeCompra < 1);
				// 35 TENEMOS QUE VOLVER A PONER COSTECOMPRA A 0 PARA
				// PODER SEGUIR CAPTURANDO ERRORES
				costeCompra = 0;
			} else if (accion.equals("2: Ver los gastos")) {
				// QUIERE VER LOS GASTOS
				// 36 AHORA QUE TENEMOS GASTOS, LOS PODEMOS LISTAR
				for (Gasto gasto : gastos) {
					msj += gasto;
				}
				JOptionPane.showMessageDialog(null, msj);
				msj = "";

			} else if (accion.equals("3: Sumar gastos")) {
				// QUIERE SUMAR LOS GASTOS
				// 37 AHORA QUE TENEMOS GASTOS, LOS PODEMOS SUMAR
				for (Gasto gasto : gastos) {
					gastosFinales += gasto.getGasto();
				}
				DecimalFormat gastoFormateator = new DecimalFormat("###,###.##");
				JOptionPane.showMessageDialog(null, "Gastos finales: " + gastoFormateator.format(gastosFinales) + "€.");
				gastosFinales = 0;
			} else {
				// NO QUIERE SEGUIR HACIENDO COSAS
				salir = 1;
			}
		}

	}

}
