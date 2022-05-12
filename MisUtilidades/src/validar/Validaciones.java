package validar;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Validaciones {
	  private static final Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z]");
	  private static final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
	  private static final String[] INVALIDOS = new String[] { "00000000T", "00000001R", "99999999R" };
	  
	  private static final Pattern nom = Pattern.compile("[a-zA-Z]{2,100}");
	  
	  private static final Pattern Tef = Pattern.compile("[0-9]{9}");
	  private static final Pattern Tef6 = Pattern.compile("^6.*");
	  
	  
	  
	  private static final String[] CLAVE = new String[] {"admin"};
	  
	  
	  public static boolean comprobarDni(String dni) {
	    return Arrays.binarySearch(INVALIDOS, dni) < 0 // (1)
		    && REGEXP.matcher(dni).matches() // (2)
	        && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23); // (3)
	  }
	  
	  public static boolean comprobarNombre(String nombre) {
		  return nom.matcher(nombre).matches();
	  }
	  
	  public static boolean comprobarTelefono(String Tfno) {
		  return Tef.matcher(Tfno).matches() && Tef6.matcher(Tfno).matches();
	  }
	  
	  public static boolean comprobarClave(String clave) {
		  return Arrays.asList(CLAVE).contains(clave);
	  }
	  
	 
}
