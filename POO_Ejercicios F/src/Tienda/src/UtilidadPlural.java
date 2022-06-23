package Tienda.src;

public class UtilidadPlural {
	
	public static String EnPlural(int num) {
		switch (num) {
			case 0:
				return "s";
			case 1:
				return "";
			default:
				return "s";
		}

	}
}
