package liskov_L;

/**
 * ETAPA__003
 * En el ejemplo que veremos a continuación suponemos que tenemos una clase
 * padre “Bird” que contiene características comunes de los pájaros.
 *
 * 
 */
@Deprecated
abstract class Bird {

	abstract String come();

	abstract String canta();

	abstract void vuela();

}
