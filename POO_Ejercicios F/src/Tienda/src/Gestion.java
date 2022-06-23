package Tienda.src;

import static java.lang.Double.parseDouble;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gestion {
	
	String msj = "";
	static ArrayList<Disco> discos = new ArrayList<>();
	static ArrayList<Carrito> carrito = new ArrayList<>();
	
	
	public void cargarDiscosIniciales() {
		discos.clear();
		//String titulo, String autor, int stock, int vendidos, double precioneto
		discos.add(new Disco("Rock", "Thriller", "Michael Jackson", 18.99, 10));
		discos.add(new Disco("Blues", "Higher", "Michael Bublé", 18.99, 10));	
		discos.add(new Disco("Jazz", "Millestones", "Miles Davis", 12.45, 5));	
		
	}
	
	
	static String estiloHtml = "<style>"
			+ "table {"
			+ "  font-family: courier, arial, sans-serif;"
			+ "  border-collapse: collapse;"
			+ "  width: 100%;"
			+ "}"
			+ ""
			+ "td, th {"
			+ "  border: 1px solid #dddddd;"
			+ "  text-align: left;"
			+ "  padding: 8px;"
			+ "}"
			+ ""
			+ "tr:nth-child(even) {"
			+ "  background-color: #dddddd;"
			+ "}"
			+ "</style>";
	
	public String listarDiscos() {
		msj = "";
		

		String col[] = {"id", "CATEGORIA", "TITULO", "AUTOR", "PRECIO", "IVA", "PVP", "STOCK", "VENDIDOS"};
		msj+="<table border>"+
				"<tr>";
		for(int i=0; i<col.length;i++) {
			msj += "<th>"+col[i]+"</th>";
		}
		msj += "</tr>";
		
		for(int i=0;i<=discos.size()-1;i++) {
			col[0] = discos.get(i).getId()+""; //convierte int a String
			col[1] = discos.get(i).getCategoria();
			col[2] = discos.get(i).getTitulo();
			col[3] = discos.get(i).getAutor();
			//col[4] = Tienda.src.Formatos.conDecimales(discos.get(i).getPrecioneto(), 2);
			//col[5] = Tienda.src.Formatos.conDecimales(discos.get(i).getIva(), 2)+"%";
			//col[6] = Tienda.src.Formatos.conDecimales(discos.get(i).getPrecioIVA(), 2);
			col[7] = discos.get(i).getStock()+"";
			col[8] = discos.get(i).getVendidos()+"";
			
			msj+=	"<tr>"+
					"<td>"+col[0]+"</td>"+
					"<td>"+col[1]+"</td>"+
					"<td>"+col[2]+"</td>"+
					"<td>"+col[3]+"</td>"+
					"<td>"+col[4]+"</td>"+
					"<td>"+col[5]+"</td>"+
					"<td>"+col[6]+"</td>"+
					"<td>"+col[7]+"</td>"+
					"<td>"+col[8]+"</td>"+
					"</tr>";
		}
		msj += "</table>"; 
		return "<html>" + estiloHtml + "<p>" + msj + "</p></html>";
	}
	
	public void addDiscos() {
		msj = listarDiscos();
		
		
		
		discos.add(new Disco(JOptionPane.showInputDialog(null, msj + "\n\nCategoría : ", "Alta de Discos", JOptionPane.PLAIN_MESSAGE),
							 JOptionPane.showInputDialog(null, msj + "\n\nTítulo : ", "Alta de Discos", JOptionPane.PLAIN_MESSAGE),
							 JOptionPane.showInputDialog(null, msj + "\n\nAutor : ", "Alta de Discos", JOptionPane.PLAIN_MESSAGE),
							 parseDouble(JOptionPane.showInputDialog(null, msj + "\n\nPrecio : ", "Alta de Discos", JOptionPane.PLAIN_MESSAGE)),
							 controlStockCompra(msj))); 	
		
	}
	
	public static int controlStockCompra(String msj) {
		int udCompra;
		do {	
			udCompra = Integer.parseInt(JOptionPane.showInputDialog(null, msj + "\n\nStock : ", "Alta de Discos", JOptionPane.PLAIN_MESSAGE));
			if(udCompra>10) {JOptionPane.showMessageDialog(null,
					"No compramos más de 10 uds de Cada Disco", 
					"ERROR DE COMPRA", JOptionPane.PLAIN_MESSAGE);}
		}while(udCompra>10);
		return udCompra;
	}
	
	static int idModificar;
	static double precioDisco;
	public void ModifDiscos() {
		msj = listarDiscos();
		
		idModificar = Integer.parseInt(JOptionPane.showInputDialog(null, msj + 
				"\n\n¿id Disco a Modificar?",
				"Modificar Datos de Discos", JOptionPane.PLAIN_MESSAGE));
		 discos.get(idModificar).setPrecioneto(Double.parseDouble(JOptionPane.showInputDialog(null, msj + 
				"\n\n¿Nuevo Precio a Modificar?",
				"Modificar Datos de Discos", JOptionPane.PLAIN_MESSAGE)));
		
		
	}
	
	
	static int idPrCompra, cantidad;
	public void addProductosCarrito() {
		msj = listarDiscos();
		boolean encontrado = false;
		idPrCompra = Integer.parseInt(JOptionPane.showInputDialog(null, msj + 
											"\n\n¿id Disco a Comprar?",
											"Compra de Discos", JOptionPane.PLAIN_MESSAGE));
		cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,  
							"\n¿Cuantos Discos quieres?","Comprar Discos", JOptionPane.PLAIN_MESSAGE));
		
		
		if(carrito.size()!=0) { //el carrito puede estar vacio
			//buscamos si tenemos el idProducto Comprado
			for(int i=0;i<carrito.size();i++) {
				if(carrito.get(i).getIdDisco()==idPrCompra) {
					Gestion.puedesModificar(i);
					encontrado = true;
					break;
				}
			}
		}else {
			Gestion.puedesDarAlta();
			encontrado = true; 
		}
		if(!encontrado) {
			Gestion.puedesDarAlta();
		}
		
	}
	public static void puedesDarAlta() {
		
		//(int idDisco, String titDisco, String autDisco, double precioDisco, int cantidad, double ivaDisco) 
		
		if(controlStock(cantidad, idPrCompra)) {
			carrito.add(new Carrito(discos.get(idPrCompra).getCategoria(),
					discos.get(idPrCompra).getId(),
					discos.get(idPrCompra).getTitulo(),
					discos.get(idPrCompra).getAutor(),
					discos.get(idPrCompra).getPrecioneto(), cantidad, 
					discos.get(idPrCompra).getIva()));
			//descontar stock
			discos.get(idPrCompra).setStock(discos.get(idPrCompra).getStock() - cantidad);
			//añadir ventas
			discos.get(idPrCompra).setVendidos(discos.get(idPrCompra).getVendidos() + cantidad);
			
			JOptionPane.showMessageDialog(null,
					"Ok, Disco :\n" + discos.get(idPrCompra).getTitulo() + "\nAÑADIDO AL CARRITO!!", 
					"CONFIRMACION DE COMPRA", JOptionPane.PLAIN_MESSAGE);
			
		}else {
			//Falta de stock
			JOptionPane.showMessageDialog(null,
					"No puedes comprar " + cantidad + " Ud" + utilidades.UtilidadPlural.EnPlural(cantidad) + 
					". del Disco : " + discos.get(idPrCompra).getTitulo() +
					" del Autor : " + discos.get(idPrCompra).getAutor() + 
					"\n Sólo tenemos " + discos.get(idPrCompra).getStock() + " Ud" + utilidades.UtilidadPlural.EnPlural(discos.get(idPrCompra).getStock()) +
					"\n\n ¡¡ FALTA STOCK!!", 
					"ERROR EN PROCESO DE COMPRA", JOptionPane.PLAIN_MESSAGE);
		}
			

	}
	public static void puedesModificar(int i) {
		
		if(controlStock(cantidad, idPrCompra)) {
			carrito.get(i).setCantidad(carrito.get(i).getCantidad() + cantidad);
			//descontar stock
			discos.get(idPrCompra).setStock(discos.get(idPrCompra).getStock() - cantidad);
			//añadir ventas
			discos.get(idPrCompra).setVendidos(discos.get(idPrCompra).getVendidos() + cantidad);
			
			JOptionPane.showMessageDialog(null,
					"Ok, Título del Disco :\n"+discos.get(idPrCompra).getTitulo()+"\n COMPRA MODIFICADA!!", 
					"CONFIRMACION DE COMPRA", JOptionPane.PLAIN_MESSAGE);
		}else {
			//Falta de stock
			JOptionPane.showMessageDialog(null,
					"No puedes comprar " + cantidad + " Ud" + utilidades.UtilidadPlural.EnPlural(cantidad) + 
					". del Título del Disco : " + discos.get(idPrCompra).getTitulo() + 
					"\n FALTA STOCK!!", 
					"ERROR EN PROCESO DE COMPRA", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	public static boolean controlStock(int cant, int idPr) {
		
		if (discos.get(idPr).getStock()>=cant) {
			//se puede servir
			
			return true;
		}else {
			//no se puede servir
			return false;
		}
		
	}
	
	
	public String verCarrito() {
		msj="";
		String col[] = {"id", "idDisco", "CATEGORIA", "TITULO", "AUTOR", "PRECIO", "CANTIDAD", "IVA", "Imp.IVA", "IMPORTE"};
		
		msj+="<table border>"+
				"<tr>";
		for(int i=0;i<col.length;i++) {
			msj += "<th>"+col[i]+"</th>";
		}
		
		msj += "</tr>";
		
		
		double Total = 0;
		for(int i=0;i<=carrito.size()-1;i++) {
			col[0] = carrito.get(i).getIdcarrito()+""; //convierte int a String
			col[1] = carrito.get(i).getIdDisco()+"";
			col[2] = carrito.get(i).getCategoria();
			col[3] = carrito.get(i).getTitDisco();
			col[4] = carrito.get(i).getAutDisco();
			//col[5] = Tienda.src.Formatos.conDecimales(carrito.get(i).getPrecioDisco(), 2);
			//col[6] = carrito.get(i).getCantidad()+""; //convierte int a String
			//col[7] = Tienda.src.Formatos.conDecimales(carrito.get(i).getIvaDisco(), 2)+"%";
			//col[8] = Tienda.src.Formatos.conDecimales(carrito.get(i).getImpivaDisco(), 2);
 			//col[9] = Tienda.src.Formatos.conDecimales(carrito.get(i).getImporte(), 2);
			
			msj+="<tr>"+
					"<th>"+col[0]+"</th>"+
					"<th>"+col[1]+"</th>"+
					"<th>"+col[2]+"</th>"+
					"<th>"+col[3]+"</th>"+
					"<th>"+col[4]+"</th>"+
					"<th>"+col[5]+"</th>"+
					"<th>"+col[6]+"</th>"+
					"<th>"+col[7]+"</th>"+
					"<th>"+col[8]+"</th>"+
					"<th>"+col[9]+"</th>"+
					"</tr>";
			
			
			Total = Total + carrito.get(i).getImporte();
		}
		
		msj += "</table><br>"; 
		//msj += "<table border><tr><th>IMPORTE TOTAL compra = " + Tienda.src.Formatos.conDecimales(Total, 2) + "</th></tr></table>";
		
		return "<html>" + estiloHtml + "<p>" + msj + "</p></html>";
	}
	
}
