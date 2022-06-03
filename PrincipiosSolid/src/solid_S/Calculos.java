package solid_S;

public class Calculos {
	
	
//	public void sumAreas(Polygono poligon1, Polygono poligon2) {
//		System.out.print(poligon1.getArea() + poligon2.getArea());
//	}
//
//	public void diffAreas(Polygono poligon1, Polygono poligon2) {
//		System.out.print(poligon1.getArea() - poligon2.getArea());
//	}

	public double sumAreas(Polygono poligon1, Polygono poligon2){
        return poligon1.getArea() + poligon2.getArea();
    }
 
    public double diffAreas(Polygono poligon1, Polygono poligon2){
        return poligon1.getArea() - poligon2.getArea();
    }
}
