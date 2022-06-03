package F24;

//Debes de volver a coger el modelo propuesto durante el curso y diseñar 
//una estructura similar. Salvo que esta vez esta estructura incluirá una 
//clase abstracta (abuela?!), una clase superclase (padre?! derivada de 
//		la clase abstracta), su subclase (hija!?) y también una interfaz 
//en cada una de las clases no abstractas (padre e hijo).  
//Crearás en el main una instancia de la subclase e imprimirás el método 
//toString de esta clase por pantalla. Tendrá que aparecer el toString de 
//la superclase, y el método de cada una de las interfaces implementadas.
//Dejo libre la elección de las clases y de las interfaces.  Puedes usar 
//un croquis para dibujar la relación entre cada clase de este proyecto. 

public class Main {

	public static void main(String[] args) {
		Abuela abuela1 = new Abuela("Pepa", 80);
		Padre padre1 = new Padre("Ramon", 50);
		Hija hija1 = new Hija("Marina", 25);
		System.out.println(abuela1);
		System.out.println(padre1);
		System.out.println(hija1);
	}

}
