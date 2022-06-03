/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyecto;

import java.util.Scanner;

/**
 *
 * @author Ludovic Laisnez
 */

class Permutacion {

    private static Scanner scanner = new Scanner(System.in);

    public static void permutar() {
        System.out.print("Entrez x: ");
        int x = scanner.nextInt();

        System.out.print("Entrez y: ");
        int y = scanner.nextInt();

        System.out.println("Avant permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        int tmp = x;
        x = y;
        y = tmp;

        System.out.println("Après permutation: ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
