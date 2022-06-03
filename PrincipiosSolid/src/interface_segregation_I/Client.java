package interface_segregation_I;

/**
 * ETAPA__004
 * En código para la interfaz y para el Client1 se vería de la siguiente forma:
 * 
 * El código para «Client2» y «Client3» sería similar al código de «Client1»,
 * pero implementando solo el método que utilizan en cada caso.
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