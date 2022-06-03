package miprimerproyecto.f.herencia;

class Triangulo extends DosDimensiones {

	//4
	public double mostrarArea() {
//		 return base*altura/2;
		return getBase() * getAltura() / 2;
	}
	
	//10
	private String estilo;	
	
	//11 CONSTRUCTORES
	public Triangulo() {
	}

	public Triangulo(String estilo, double base, double altura) {		
		//12 USO DE SUPER()
//		super();
		super(base, altura);
		this.estilo = estilo;
	}
	
	Triangulo(double base, double altura, String estilo){
        //13 USO DE SET
		setBase(base);
        setAltura(altura);
        this.estilo=estilo;
    }

	//14 GETTERS SETTERS
	public String getEstilo() {
		return "Es un " + estilo;
	}	

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}


	
	



}
