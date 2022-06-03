package interface_segregation_I;

/**
 * ETAPA__010 
 * La conclusión obtenida de este principio es que ninguna clase
 * debería depender de métodos que no usa. Por tanto, cuando creemos interfaces
 * que definen comportamientos, es importante estar seguros de que todas las
 * clases que implementen esas interfaces vayan a necesitar y ser capaces de
 * agregar comportamientos a todos los métodos. En caso contrario, es mejor
 * tener varias interfaces más pequeñas. Como reflexión final, cuando un código
 * depende de elementos o implementa métodos que no necesita, puede traer
 * problemas no esperados.
 *
 */
public class Cliente3 implements IOperacionServicio3 {

	@Override
	public void op3() {
		// GENERA ALGUNA OPERACIÓN

	}

}
