package C7;

public class Funciones {
	
	//Ejercicio C7_1
	public String juegoDados(int d1, int d2, int d3) {
		
		String mensaje="";
		if(d1==6 && d2==6 && d3==6) {
			mensaje = "¡¡ Excelente !!";
			
		}else if(d1==6 && (d2==6 || d3==6)){
			mensaje = "Muy Bien ;-)";
		}else if(d2==6 && (d1==6 || d3==6)){
			mensaje = "Muy Bien ;-)";
		}else if(d1==6 || d2==6 || d3==6){
			mensaje = "Regular... vuelve a intentarlo... ";
		}else {
			mensaje = "¡¡ Uff... Pésimo :-( !!";
		}
		
		
		return mensaje;
		
	}
	
	//Ejercicio C7_2
	public int numeroCifras(String numero) {
		
		int cifras = numero.length();
		return cifras;
	}
}
