package miprimerproyecto.f.propiedades_finales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_C8_1 {

	/**
	 * 20 Realizar un convertisor monetario que pida al usuario introducir por
	 * teclado el tipo de conversión que desea realizar (Nos limitaremos a
	 * conversiones de Euros a Dolares, Yen y Libras) y la cantidad de dinero que
	 * desea cambiar. Al finalizar las peticiones, el programa realiza las
	 * conversiones adecuadas.
	 */
	public Tarea_C8_1() {

		// 21 clase scanner en try catch
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println(ConvertisorA.cantidadEuros);
			ConvertisorA.euros = teclado.nextDouble();
			System.out.println(ConvertisorA.acciones);
			ConvertisorA.conversion = teclado.nextByte();
		} catch (InputMismatchException e) {
			System.err.println("Error, entrada invalida.");
			System.exit(-1);
		}

		// 22 llamada al método conversor
		System.out.printf(ConvertisorA.devuelveConversion(ConvertisorA.conversion, ConvertisorA.euros));

		// 23 cerrando el scanner
		teclado.close();

	}

}
