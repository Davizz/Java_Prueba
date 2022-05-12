package A1_1;

public class Main {

	/*
	 * Ej A1_1 
		Declarar los variables siguientes con sus valores e imprimirlas todas usando los 3 métodos de print.
        casado = true					boleano
        MAXIMO = 99999					integer y atributo final
        diasem = 1						byte
        dianual = 300					short
        miliseg = 12983328000000		long
        totalfactura = 10350.678000		float
        poblacion = 6775235741			long

	 */
	public static void main(String[] args) {
		boolean casado = true;
		final int MAXIMO = 99999;
		byte diasem = 1;
		short dianual = 300;				
		long miliseg = 12983328000000L;
		float totalfactura = 10350.678000F;
		long poblacion = 6775235741L;
		
		System.out.print(casado+"\n");
		System.out.println(MAXIMO);
		System.out.printf("%s\n", diasem);
		System.out.print(dianual+"\n");
		System.out.println(miliseg);
		System.out.printf("%f\n", totalfactura);
		System.out.print(poblacion);

	}

}
