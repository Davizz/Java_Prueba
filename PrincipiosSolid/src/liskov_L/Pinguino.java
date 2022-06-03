package liskov_L;

/**
 * ETAPA__011
 * y “Pinguino” seguirá heredando de “Pajaro” pero sin
 * tener que implementar la funcionalidad de fly().
 *
 */
public class Pinguino extends Pajaro {

	@Override
	String come() {
		// TODO Auto-generated method stub
		return "Peces";
	}

	@Override
	String canta() {
		// TODO Auto-generated method stub
		return "Squawk";
	}

}
