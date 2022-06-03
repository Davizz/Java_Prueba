package liskov_L;

/**
 * ETAPA__008
 * Una solución sería crear otra clase “PajaroVoladores” que herede de “Pajaro” y que
 * implemente la función vuela() 
 * 
 * ETAPA__010
 * en este caso los subtipos “Pato” y “Loro”
 * heredarán de esta clase, 
 *
 * 
 */
abstract public class PajaroVoladores extends Pajaro {

	@Override
	abstract String come();

	@Override
	abstract String canta();

	abstract void vuela();

}
