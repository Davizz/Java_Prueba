package miprimerproyecto.f.ej17;

import java.util.ArrayList;

//import formateando.Format;

public class ProductoComprado extends ProductoDisponible {
	int cantidad;

	public ProductoComprado(ProductoDisponible producto, int cantidad) {
		super(producto.getNombre(), producto.getPrecioSinIva(), producto.getIVA());
		this.cantidad = cantidad;
		
	}

	public double coste() {
		return ((this.getPrecioSinIva() * this.getIVA()/100) + this.getPrecioSinIva()) * this.cantidad;
	}
	
	public double costeToString() {
		double coste = ((this.getPrecioSinIva() * this.getIVA() / 100) + this.getPrecioSinIva()) * this.cantidad;
//		return Format.getPriceFormatted(coste);
		return coste;
	}

	@Override
	public String toString() {
		return super.getNombre() + "------------------" + super.getPrecioSinIva() + "------------------" + cantidad
				+ "------------------" + super.getIVA() + "------------------" + costeToString()+"\n";
	}

}
