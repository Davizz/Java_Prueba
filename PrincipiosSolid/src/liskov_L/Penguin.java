package liskov_L;

/**
 * ETAPA__006
 * Puede que pensemos que estamos realizando la herencia correctamente hasta que
 * un día llega un nuevo requisito y tenemos que implementar un nuevo tipo de
 * pájaro, el pingüino.
 * 
 * @author Usuario
 *
 */
@Deprecated
public class Penguin extends Bird {

	@Override
	String come() {
		return "Peces";
	}

	@Override
	String canta() {
		return "Squawk";
	}

	@Override
	public void vuela() {
		throw new UnsupportedOperationException();
	}

}
