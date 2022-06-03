package solid_S;

public class Circulo extends Polygono {
	 
    int radius;
 
    public Circulo(int radius){
        this.radius = radius;
    }
 
    public int getRadius(){
        return this.radius;
    }
 
    public void setRadius(int radius){
        this.radius = radius;
    }
 
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
 
}
