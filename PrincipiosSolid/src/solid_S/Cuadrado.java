package solid_S;

public class Cuadrado extends Polygono {

	int lado;

	public Cuadrado(int side) {
		this.lado = side;
	}

	public int getLado() {
		return this.lado;
	}

	public void setLado(int side) {
		this.lado = side;
	}

	@Override
	public double getArea() {
		return Math.pow(lado, 2);
	}

}
