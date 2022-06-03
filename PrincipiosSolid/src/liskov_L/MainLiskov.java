package liskov_L;

public class MainLiskov {

	/** ETAPA__001
	 * Este principio de la programación orientada a objetos debe su nombre a
	 * Barbara Liskov, reconocida ingeniera de software que fue la primera mujer de
	 * los Estados Unidos en conseguir un doctorado en Ciencias de la Computación,
	 * Un mujer muy famosa en el mundo de la Programación en EEUU.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * S O Liskov Substitution Principle I D
		 * 
		 * ETAPA__002
		 * Barbara Liskov realizó una primera definición en la conferencia sobre
		 * abstracción de datos y jerarquía de 1987:
		 * 
		 * El principio de Liskov nos da una serie de pautas para guiar la herencia
		 * entre clases. La principal que debe cumplir si estamos realizando la herencia
		 * de una manera correcta es que cada clase que hereda de otra puede usarse como
		 * su padre sin necesidad de conocer las diferencias entre ellas.
		 * 
		 * Si cuando sobreescribimos un método en la clase que hereda necesitamos lanzar
		 * una excepción o no realiza nada, entonces probablemente estamos violando el
		 * LSP.
		 * 
		 * Esta premisa es clave para detectar fallos en la arquitectura de nuestra
		 * aplicación o posibles “code smells�?.
		 * 
		 * Es más fácil entender el concepto utilizando un ejemplo que viole el
		 * principio de sustitución de Liskov.
		 * 
		 */

	}

	/**
	 * ETAPA__007
	 * Para controlar la excepción podríamos pensar que es buena idea añadir una
	 * regla para saber que tipo de pájaro es en el código que utiliza nuestro
	 * modelo Bird:
	 * 
	 * @param bird
	 */
	public void startFlying(Bird bird) {
		if (Penguin.class.isInstance(bird)) {
			// can’t fly
		} else {
			bird.vuela();
		}
	}

	/*
	 * Pero en este caso estaríamos violando el LSP, porque nos indica que el código
	 * debería funcionar sin conocer la clase exacta del objeto “Bird�?. Si en un
	 * futuro tuviéramos que implementar más casos con excepciones este listado iría
	 * creciendo y daría lugar a un código difícil de mantener y más propenso a
	 * fallos y errores.
	 * 
	 */

}
