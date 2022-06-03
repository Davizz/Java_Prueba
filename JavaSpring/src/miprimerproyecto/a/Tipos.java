package miprimerproyecto.a;

public class Tipos {

	public static void main(String[] args) {
		
		byte be = -128;
		byte be2 = 127;
		int it1 = -2147483648;
		int it2 = 2147483647;
		short st1 = 32767;
		short st2 = -32768;
		long lg1 = -5000000000000000000L;
		long lg2 = 9223300000000000000L;
		long lg3 = 9223372036854775807L;

		long lg4 = Long.MAX_VALUE;
		long lg5 = Long.MIN_VALUE;

		float ft1 = 3.25F;
		double de1 = 1.1234567891011121314151617181920;
		double de2 = 12345678910111213141516171819.0;
		char cr1 = 'a';
		char cr2 = 'z';
		char cr7 = '@';
		boolean bn1 = true;
		boolean bn2 = false;

		//Tipos tipos = new Tipos();

		System.out.println("LG4 = " + lg4);
		
		System.out.println("Uso del método compare: " + Long.compare(lg1, lg2));
		System.out.println("Uso del método compare: " + Long.compare(lg2, lg5));
		if(Long.compare(lg1, lg2)>0) {
			System.out.println("Lg1 es más grande que lg2"); 
		} else if(Long.compare(lg1, lg2)==0) {
			System.out.println("Lg1 es igual a lg2"); 
		} else {
			System.out.println("Lg1 es más pequeño que lg2"); 
		}
		
	
	}

	

}
