package interface_segregation_I;

/**
 * ETAPA__010 
 * La conclusi�n obtenida de este principio es que ninguna clase
 * deber�a depender de m�todos que no usa. Por tanto, cuando creemos interfaces
 * que definen comportamientos, es importante estar seguros de que todas las
 * clases que implementen esas interfaces vayan a necesitar y ser capaces de
 * agregar comportamientos a todos los m�todos. En caso contrario, es mejor
 * tener varias interfaces m�s peque�as. Como reflexi�n final, cuando un c�digo
 * depende de elementos o implementa m�todos que no necesita, puede traer
 * problemas no esperados.
 *
 */
public class Cliente3 implements IOperacionServicio3 {

	@Override
	public void op3() {
		// GENERA ALGUNA OPERACI�N

	}

}
