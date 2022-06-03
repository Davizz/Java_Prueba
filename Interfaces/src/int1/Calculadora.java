package int1;

public class Calculadora implements InterfazCalculadora {
	
	@Override
	public String tieneCalculadora(boolean opcion) {
		if(opcion) {
			return "Este aparato tiene integrado una calculadora";
		}
		return "No tiene ni siquiera una calculadora"; 
	}	
	

}
