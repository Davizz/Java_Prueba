package F22;

public class Funciones {
	
	/* Ej F22_1: Abstracción y personajes de fantasía 
		Quiero que programes un mini juego con todo lo que hemos visto hasta ahora. Bucles, Array, Listas, Condicionales, POO, Uso de clases de la API, …
		Es importante que intentes implementar por ti mismo las reglas del juego. Pero tienes que comentar tu código para aclarar tus líneas de código y ayudar los lectores de tus clases a entender mejor tus intenciones. No pasa nada si te pasas y si lo haces como si fuésemos unos tontos. 😉 No dudes en copiar/pegar los contenidos de esta tarea a tus clases y a adaptar tus propias reglas. Yo te voy a proponer un guion para que lo puedas desarrollar, pero puedes salirte de este guion si lo juzgas mejor. Lo único que tienes que hacer en este caso es explicar tus nuevas reglas, motivos y elecciones. 
		¡¡Vayamos al grano!! 
		Para empezar, debes de crear una clase abstracta llamada Personaje. Esta clase contiene los métodos lucha(), corre() y nada(). Todos devuelven un resultado entero.
		A continuación, añadirás las propiedades siguientes: nombre, raza, 3 características fuerza, agilidad y percepción, la iniciativa, el factor de armadura y los puntos de vida. Con sus getters setters y su método toString. Nada de abstracción en estos casos. 
		Las características pueden ir de 3 a 24. Se calculan lanzando 2 dados de 6 caras normales y 1 especial (también de 6 caras) según el funcionamiento siguiente: 
		Lanzando los dados, lógicamente obtendrás un resultado comprendido entre 3 y 18. Pero, si el resultado obtenido con el dado especial es igual a 6, se añade el valor de un dado de 6 extra al resultado final. Para conseguir realizar esto, tendrás que usar métodos que represente la acción de lanzar un dado. Puede que pienses también en crear una clase a parte ya que seguiremos usando dados más tarde en el main. 
		Los puntos de vida (PV) se obtienen calculando la media de las 3 características redondeas al superior. 
		El factor de armadura es un número comprendido entre 0 y 6. Representa la protección que le da una armadura a un héroe. Siendo 0 ninguna armadura y 6 una armadura muy gruesa y resistente. 
		La iniciativa se obtiene calculando la media de las 3 características al que hay que restar el factor de armadura. 
		Después tienes que crear tres clases que heredan de Personaje. Cada clase lleva el nombre de un oficio de personaje de fantasía (una clase para los jugadores de juegos de rol). Pudiendo ser lo que quieras: Caballero, Guerrero, Espadachín, Jinete, Montaraz, Ladron… 
		
		Cada uno de ellos implementará los métodos de la clase Personaje de una forma especial teniendo en cuenta por ejemplo que: 
		el jinete es el más rápido de todos. Puede que reciba algún bonus en la ejecución del método corre. 
		el caballero es el más eficiente en lucha cuerpo a cuerpo. Es un personaje que dispone de la protección más elevada. Eso hará que no pueda nadar ya que el peso de su armadura se lo impide. 
		En el main, debes instanciar 3 heroes, hacerles participar a pruebas de lucha, de natación y de carrera y sacar por pantalla una presentación detallada de cada héroe y darnos una idea de quien ha sido el vencedor de cada prueba con la puntuación de cada uno. 
		Además, para la prueba de la lucha puedes imaginar un combate entre 2 luchadores: Eres libre de implementar una forma de resolver el combate. Pero puedes tener en cuenta los elementos siguientes: 
		El asalto se calcula sumando un par de dados de 6 a la iniciativa del asaltante. 
		El resultado más alto determina el que hace daño al otro. 
		Los daños se pueden determinar con un dado de 6 sumado a la fuerza del atacante. 
		Se resta el factor de armadura a los daños y se obtiene los daños finales. 
		Se resta los daños finales a los puntos de vida. 
		En caso de tener más de 0 PV, la lucha continua hasta que los PV de un luchador lleguen a 0 o menos.  
		En mi propuesta, la suerte interviene en el combate. Pero no demasiado teniendo en cuenta que la iniciativa es un valor que está comprendido entre 3 y 24 y que los dos datos dan entre 2 y 12.  
		Para realizar esta tarea, encontrarás seguramente problemas para acceder a los métodos de cada uno de los personajes. Ten en cuenta que las subclases heredan las propiedades y métodos de la superclase pero que la superclase no tiene acceso a los métodos de las subclases. 
	 */
	public void F22_1() {
		
	}
	
	
}
