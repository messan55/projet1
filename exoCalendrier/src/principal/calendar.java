package principal;

import java.util.Scanner;

public class calendar {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("saisir année");
		int annee = Integer.parseInt(reader.nextLine());
		System.out.println("saisir mois");
		int mois = Integer.parseInt(reader.nextLine());
		
		System.out.println(Calendrier(annee, mois));
	}
	
	public static String Calendrier(int annee, int mois){
		return  header(annee, mois);
		
	}
	
	public static String header(int annee, int mois){
		StringBuilder sb = new StringBuilder("---------------------\n");
		sb.append("    ");
		sb.append(nomMois(mois));
		sb.append("    ");
		sb.append(annee);
		sb.append("\n-----------------------\n");
		sb.append("LUN MAR MER JEU VEN SAM DIM");
		return sb.toString();
	}

	public static String nomMois(int mois) {
		String[] tabmois = {"janvier", "fevrier", "mars", "avril", "mai",
				"juin", "juillet", "aout", "septembre", "octobre",
				"novembre", "decembre" };
	
	if (mois < 1 || mois > 12)
		return "";
	
	return tabmois[mois -1];
	}
	
	public static String corps(int annee, int mois) {
		StringBuilder sb = new StringBuilder();
		int nbjours = nbJoursMois(annee, mois);
		boolean leapyear = estBissextile(annee);
		sb.append("nbjours = " + nbjours + " bissextile = " + leapyear);
		return sb.toString();
	}
	
	
	public static int nbJoursMois(int annee, int mois){
		switch(mois) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return (estBissextile(annee)? 29 : 28);
	}
	return 0;
	}
	
	public static boolean estBissextile(int annee){
		return annee % 4 == 0 && annee % 400 != 0 || annee % 100 == 0;
	}
}
