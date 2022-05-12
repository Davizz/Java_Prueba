package E16;

public class Factorial {
	
    int facRecursivo (int n){
        int resultado;
        if (n == 1) {
        	return 1;
        }
        resultado = facRecursivo(n - 1) * n;
        return resultado;
    }
    
    int facNOrecursivo (int n){
        int t, resultado;
        resultado = 1;
        for (t=1; t<=n; t++) {
        	resultado *= t;
        }
        return resultado;
    }
}
