package liskov_L;


/**
 * ETAPA__004
 * A partir de esta clase podemos crear subtipos sin problemas, como por ejemplo los siguientes:
 * @author Usuario
 *
 */
public class Loro extends PajaroVoladores {
	 
    @Override
    public String come(){
        return "Insectos";
    }
 
    @Override
    public String canta(){
        return "Chirp";
    }

	@Override
	void vuela() {
		// TODO Auto-generated method stub
		
	}


 
}
