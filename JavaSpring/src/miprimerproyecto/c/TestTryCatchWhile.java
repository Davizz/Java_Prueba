package miprimerproyecto.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatchWhile {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int s;
		int choice = 0;
		boolean juste = false;

		System.out.println("");
		System.out.println("\t^^ BiEnVeNuE DaNs Le PrOgRaMmE pRiNcIpAl ^^");
		System.out.println("\t Faites un choix");
		System.out.println("\t\t(1) Chercher la classe d'une IP");
		System.out.println("\t\t(2) Chercher une adresse de sous-reseau");
		System.out.println("\t\t(3) Chercher une adresse broadcast");
		System.out.println("\t\t(4) Chercher une adresse d'hote");

		while (!juste) {
			s = read.nextInt();
			try {			
				if (s < 1 || s > 4) {
					System.out.println("Choix invalide!");
				} else {
					juste = true;
					choice = s; 
				}
			} catch (NumberFormatException e) {
				System.out.println("Choix invalide!");
			}catch (InputMismatchException e) {
				System.out.println("Choix invalide!");
			}
		}
		System.out.println(choice);
	}

}
