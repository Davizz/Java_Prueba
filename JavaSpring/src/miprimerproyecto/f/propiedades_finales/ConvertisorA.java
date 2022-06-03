package miprimerproyecto.f.propiedades_finales;

public class ConvertisorA {
	// 16 LAS PROPIEDADES FINALES Y ESTÁTICAS
	static final double DOLAR = 1.13;
	static final double YEN = 126.83;
	static final double LIBRAS = 0.86;
	// 17 el tipo de acción disponible
	static byte conversion = 0;
	static String acciones = "Introduzca el factor de conversión:\n 1 para cambiar a DOLAR\n2 para cambiar a YEN\n3 para cambiar a LIBRAS.";
	// 18 la cantidad de euros utilizada
	static double euros = 0;
	static String cantidadEuros = "Introduzca la cantidad en EUROS";

	//19 El método que devulve el resultado
	public static String devuelveConversion(byte conversion, double euros) {
		if (conversion == 1) {
			double dolar = euros * DOLAR;
			return String.format("%.2f euros son %.2f dólares americanos.", euros, dolar);
		} else if (conversion == 2) {
			double yen = euros * YEN;
			return String.format("%.2f euros son %.2f yenes japoneses.", euros, yen);
		} else if (conversion == 3) {
			double libras = euros * LIBRAS;
			return String.format("%.2f euros son %.2f libras esterlinas.", euros, libras);
		} else {
			return String.format("ERROR: factor de conversión erróneo");
		}
	}

}
