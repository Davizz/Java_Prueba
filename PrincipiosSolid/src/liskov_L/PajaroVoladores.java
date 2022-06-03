package liskov_L;

/**
 * ETAPA__008
 * Una soluci�n ser�a crear otra clase �PajaroVoladores� que herede de �Pajaro� y que
 * implemente la funci�n vuela() 
 * 
 * ETAPA__010
 * en este caso los subtipos �Pato� y �Loro�
 * heredar�n de esta clase, 
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
