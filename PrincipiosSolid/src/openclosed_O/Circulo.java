package openclosed_O;

class Circulo extends Poligono {
	/*mal
//	int radio;
//
//	public Circulo(int radio) {
//		super.type = 2;
//		this.radius = radio;
//	}
//
//	public int getRadio() {
//		return this.radio;
//	}
 mal*/
	
	int radio;
	 
    public Circulo(int radius) {
        this.radio = radius;
    }
 
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }
	

}