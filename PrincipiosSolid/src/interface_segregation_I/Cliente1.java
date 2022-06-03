package interface_segregation_I;

/**
 * ETAPA__008
 * Al crear interfaces más pequeños, tenemos la ventaja adicional de que, si es
 * necesario crear nuevas implementaciones de la interfaz para un caso de uso
 * concreto, no necesitaremos implementar también el resto de métodos que no
 * están relacionados con ese caso de uso. 
 *
 */
public class Cliente1 implements IOperacionServicio1 {

	@Override
	public boolean op1() {

		return true;
	}

}
