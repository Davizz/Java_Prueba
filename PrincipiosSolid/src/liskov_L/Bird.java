package liskov_L;

/**
 * ETAPA__003
 * En el ejemplo que veremos a continuaci�n suponemos que tenemos una clase
 * padre �Bird� que contiene caracter�sticas comunes de los p�jaros.
 *
 * 
 */
@Deprecated
abstract class Bird {

	abstract String come();

	abstract String canta();

	abstract void vuela();

}
