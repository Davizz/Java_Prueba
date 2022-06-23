package F17;

public class ProductoComprado extends Producto {
	int cantidad;

	public ProductoComprado(Producto producto, int cantidad) {
		super(producto.getNombre_producto(), producto.getPrecio_SinIva(), producto.getIVA());
		this.cantidad = cantidad;

	}

	public double coste() {
		return ((this.getPrecio_SinIva() * this.getIVA() / 100) + this.getPrecio_SinIva()) * this.cantidad;
	}

	public double costeToString() {
		double coste = ((this.getPrecio_SinIva() * this.getIVA() / 100) + this.getPrecio_SinIva()) * this.cantidad;
//	return Format.getPriceFormatted(coste);
		return coste;
	}
}


