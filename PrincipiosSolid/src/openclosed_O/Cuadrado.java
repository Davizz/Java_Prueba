package openclosed_O;

class Cuadrado extends Poligono {
	/*mal
//	int lado;
//
//	public Cuadrado(int lado) {
//		super.type = 1;
//		this.lado = lado;
//	}
//
//	public int getLado() {
//		return this.lado;
//	}
 mal*/

	int lado;

	public Cuadrado(int lado) {
		this.lado = lado;
	}

	public double area() {
		return Math.pow(lado, 2);
	}

}
