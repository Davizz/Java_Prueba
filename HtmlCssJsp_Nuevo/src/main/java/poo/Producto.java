package poo;

public class Producto {
	
	public Producto(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name; 
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	
	

}
