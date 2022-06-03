package interface_segregation_I;

/**
 * ETAPA__009
 * 
 * Un concepto interesante relacionado con este principio es el “role
 * interface”, este tipo de interfaz implementa varios interfaces específicos
 * para cada caso. 
 * 
 * https://martinfowler.com/bliki/RoleInterface.html
 *
 */
public class Cliente2 implements IOperacionServicio2 {

	@Override
	public String op2() {
		// TODO Auto-generated method stub
		return "Algún texto";
	}



}
