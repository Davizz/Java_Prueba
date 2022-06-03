package F17;




public class Main {

	public static void main(String[] args) {
		new Menu(); 
	}}
		
//		Producto p1 = new Producto("Pantalón", 2, 25);
//		Producto p2 = new Producto("Camisa", 4, 32);
//		
//	System.out.println(p1);
////		System.out.println(p2);
//	ArrayList<Producto> tienda = new ArrayList<Producto>(Arrays.asList(p1,p2));
//
//	 
//	System.out.println(tienda.get(0));
//	System.out.println(tienda.get(1));
//	
//	try {
//	boolean salir = false;
//	
//	do {
//		String opcionesMenu = JOptionPane.showInputDialog("1. Lista de productos\" \r\n"
//			+ 									"2. Seleccionar productos\"\r\n"
//			+ 								 "3. Pasar por caja\"\r\n"
//			+ 									 "4. Salir del programa\" ");
//
//	
//	 String msj = "";
//		switch (opcionesMenu) {
//		case "1":
//			for (Producto p : tienda) {
//				msj += p.toString();
//			}
//			JOptionPane.showMessageDialog(null, msj); 
//			salir = true;
//		case "2":
//			String producto = (JOptionPane.showInputDialog(null, "Escoje un producto", "Productos disponibles",
//					JOptionPane.QUESTION_MESSAGE, null, tienda.toArray(), "Selecciona")).toString();
//			System.out.println(producto);
//			
//			int id = (producto.charAt(0) == 1 ? (producto.charAt(1) == 0 ? 10 : 1)
//					: Integer.parseInt(producto.substring(0, 1)));
//			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad deseada"));
//			
//			
//			ArrayList<ProductoComprado> compra = new ArrayList<ProductoComprado>();
//			 
////			Producto miProducto = tienda.get(id);
////			ProductoComprado comprando = ProductoComprado(producto, cantidad);
////			compra.add(comprando);
//		case "3":
//			
//			System.out.print("has comprado "+ cantidad + " de " + producto);
//
//		
//		}
//		
//		}while (salir == true);
//		}catch (NullPointerException e) {
//			JOptionPane.showMessageDialog(null, "Acabas de salir de la aplicación.", "Error", JOptionPane.ERROR_MESSAGE);
//			System.exit(-1);}}
//
//	
//	
//
//	}
//	
//		