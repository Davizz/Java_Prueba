package Tienda.src;

import java.text.DecimalFormat;

public class Formatos {
	
	//static DecimalFormat formateaDecimales = new DecimalFormat("###,###.##");
	static DecimalFormat formateaSINdecimales = new DecimalFormat("###,###");
	static String decimales = "#";
	
	public static String conDecimales(double num, int Cuantosdecimales) {
		DecimalFormat formateaDecimales = new DecimalFormat("###,###." + repetiR(decimales, Cuantosdecimales));
		
		return formateaDecimales.format(num);
	}
	
	//repetir sin recursividad
	public static String repetiR(String decimales, int numRepes) {
		for(int i=1;i<numRepes;i++) {
			decimales = decimales+"#";
		}
		return decimales;
	}
	
	//repetir cadena con recursividad
	//public static String repetiR(String decimales, int numRepes) {
	//	return (numRepes==0)?decimales:repetiR(decimales+"#",(numRepes--));
	//}
	
	
	
	public static String sinDecimales(double num) {
		return formateaSINdecimales.format(num);
	}
	
}
