package principal;

import java.awt.Label;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("nombre de notes?");
		Scanner readerNombre = new Scanner(System.in);
		int nombre = Integer.parseInt(readerNombre.nextLine());
		double[] arrayNote= new double[nombre];
		System.out.println("saisir notes");
		for (int i = 0; i < nombre; i++) {		
			double note = Double.parseDouble(readerNombre.nextLine());
			arrayNote[i] = note;
			System.out.println("note suivante:");
		}
		
		double somme = 0;		
		Arrays.sort(arrayNote);
		int noteSup = 0;
		
		for (double laNote : arrayNote) {
			somme = somme + laNote;
			double moyenne = somme/nombre;
			if (laNote > moyenne) {
				noteSup++;
			}
		}
		double moyenne = somme/nombre;
		
		System.out.println("la moyenne :" + moyenne);
		System.out.println("le minimum :" + arrayNote[0]);
		System.out.println("le maximum :" + arrayNote[nombre - 1]);
		System.out.println("le nombre :" + noteSup);
	}

}
