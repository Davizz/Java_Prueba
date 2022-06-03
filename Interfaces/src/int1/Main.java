package int1;

public class Main {

	public static void main(String[] args) {
	
		
		
		System.out.println("****************HERENCIA MÚLTIPLE****************************");
		/* 	//8
		 * Herencia Múltiple (a través de interfaces): en Herencia múltiple, una clase
		 * puede tener más de una superclase y heredar características de todas las
		 * clases principales. Tenga en cuenta que Java no admite herencia múltiple con
		 * clases. En Java, podemos lograr herencia múltiple solo a través de
		 * Interfaces. 
		 */
		
		System.out.println("###################1####################");
		Telefono telefonoViejo = new Telefono(645789789, "Fernando");
		System.out.println(telefonoViejo);
		System.out.println(telefonoViejo.pasarLlamadas(689147258));
		System.out.println(telefonoViejo.tieneCalculadora(true));
		System.out.println(telefonoViejo.tieneInternet(false));
		System.out.println("###################2####################");
		Telefono telefonoNuevo = new Telefono(619123123, "Ludovic");
		System.out.println(telefonoNuevo);
		System.out.println(telefonoNuevo.pasarLlamadas(615789852));
		System.out.println(telefonoNuevo.tieneCalculadora(true));
		System.out.println(telefonoNuevo.tieneInternet(true));
		
	
	

	}

}
