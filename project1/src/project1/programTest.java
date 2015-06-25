package project1;

import java.util.Scanner;

public class programTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir une taille :");
		int taille;
		taille = Integer.parseInt(sc.nextLine()); 
		
		int tailleLigne = taille;
		for (int colonne = 0; colonne < taille; colonne++) {
			
			for (int ligne = 0; ligne < tailleLigne; ligne++) {

				
				
				
				if (ligne > 0 && colonne > 0 && colonne != taille && ligne != tailleLigne-1) {
					System.out.print("  "
							+ "");
				}
				else{
					System.out.print("* ");
				}

			}
			tailleLigne--;
			System.out.println();
		}	
		
		
	}

}
