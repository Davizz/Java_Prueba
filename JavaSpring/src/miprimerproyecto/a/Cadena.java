package miprimerproyecto.a;

public class Cadena {
	public static void main(String[] args) {
		String cad1 = "Pedro";
		String cad2 = "Perro";
		System.out.println("Línea 1");
		System.out.println(cad1 + " " + cad2);
		// hay que usar printf
		// para imprimir todo
		System.out.println("Línea 2");
		System.out.printf(cad1 + "\t" + cad2 + "\n");
		// longitud de cad1
		System.out.println("Línea 3");
		System.out.printf("La longitud de %s es %d\n", cad1, (int) cad1.length());
		// concatenar cad1 con cad2
		System.out.println("Línea 4");
		System.out.printf("%s%s\n", cad1, cad2);
		// comparar los cadenas usando cada uno de los dos metodos
		System.out.println("Línea 5");
		System.out.printf("%s\n", cad1.equals(cad2));
		System.out.println("Línea 6");
		System.out.printf("%s\n", cad1.equalsIgnoreCase(cad2));
		// comparar usando compareTO()
		System.out.println("Línea 7");
		System.out.printf("%s\n", cad1.compareTo(cad2));

		// sacar primeros 5 caracteres de cad1
		System.out.println("Línea 8");
		System.out.printf("%s\n", cad1.substring(0, 5));
		// pasar cad1 a minúsculas
		System.out.println("Línea 9");
		System.out.printf("%s\n", cad1.toLowerCase());
		System.out.println("Línea 10");
		System.out.printf("%.5s\n", cad1);
	}
}
