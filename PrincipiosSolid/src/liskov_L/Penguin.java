package liskov_L;

/**
 * ETAPA__006
 * Puede que pensemos que estamos realizando la herencia correctamente hasta que
 * un d�a llega un nuevo requisito y tenemos que implementar un nuevo tipo de
 * p�jaro, el ping�ino.
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
