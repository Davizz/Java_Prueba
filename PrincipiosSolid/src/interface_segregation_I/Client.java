package interface_segregation_I;

/**
 * ETAPA__004
 * En c�digo para la interfaz y para el Client1 se ver�a de la siguiente forma:
 * 
 * El c�digo para �Client2� y �Client3� ser�a similar al c�digo de �Client1�,
 * pero implementando solo el m�todo que utilizan en cada caso.
 * 
 * Este es el ejemplo MALO. Es el ejemplo que no hay que hacer.
 */
@Deprecated
public class Client implements IOperationsService {

	@Override
	public boolean op1() {
		return true;
	}

	@Override
	public String op2() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void op3() {
		throw new UnsupportedOperationException();
	}
}