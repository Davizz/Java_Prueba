package miprimerproyecto.f.sobrecarga;

import java.util.ArrayList;
import java.util.Arrays;

import miprimerproyecto.f.estatico.Empleado;

public class MainSobrecarga {

	public static void main(String[] args) {
		//1 a 8 Animal
		//A partir de 9 MainSobrecarga
		Animal desconocido = new Animal();
		Animal gato = new Animal("Gato siamés","Gato común"); 
		Animal perro = new Animal("San Bernardo", "Canis Familiaris", 15, "Mammalia", "Carnivoro", "Canidae");
		Animal delfin = new Animal("Delfín mular", "Mammalia", "Artiodactyla", "Delphinidae");

		gato.setEspecie(true, "Felis silvestris");
		
		ArrayList<Animal> animales = new ArrayList<Animal>(Arrays.asList(desconocido, gato, perro, delfin));
		for(Animal animal : animales) {
			System.out.println(animal);
		}
		
		
	}

}
