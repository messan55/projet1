package principal;

import java.util.Scanner;

import metier.Convertisseur;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("saisissez le type de temperature");
		
		Scanner reader = new Scanner(System.in);
		String temperature = reader.nextLine();
		
		System.out.println("saisissez sa valeur");
		Scanner newReader = new Scanner(System.in);
		double valeur = Integer.parseInt(newReader.nextLine());
		
		Convertisseur conv = new Convertisseur();
		while (true) {
			try {
				conv.convertir(temperature, valeur);
				break;
			} catch (Exception e) {
				System.out.println("erreur de saisi" + e.getMessage());
				break;
			}
		}
		
		newReader.close();
		reader.close();
			
	}
	
}
