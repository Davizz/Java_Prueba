package interface_segregation_I;

/**
 * ETAPA__008
 * Al crear interfaces m�s peque�os, tenemos la ventaja adicional de que, si es
 * necesario crear nuevas implementaciones de la interfaz para un caso de uso
 * concreto, no necesitaremos implementar tambi�n el resto de m�todos que no
 * est�n relacionados con ese caso de uso. 
 *
 */
public class Cliente1 implements IOperacionServicio1 {

	@Override
	public boolean op1() {

		return true;
	}

}
