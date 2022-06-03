package miprimerproyecto.e.recursividad;

//Un simple programa de recursividad
class Factorial {
	// Esto es un método recursivo
	public int facR(int n) {
		int resultado;
		if (n == 1) {
			return 1;
		}
		
		resultado = facR(n - 1) * n;
		//Con 6 resultado = facR(facR(facR(facR(facR(1)*2)*3)*4)*5)*6
		//1*2*3*4*5*6
		return resultado;
	}

	// Esto es un equivalente iterativo
	public int facI(int n) {
		int t, resultado;
		resultado = 1;
		for (t = 1; t <= n; t++) {
			resultado *= t;
		}
		return resultado;
	}
}
