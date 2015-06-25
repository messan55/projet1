package principal;

public class Program {
	public static void main(String[] args){
		
		int[] tab = {1, 3, 5, 7, 11, 13, 2, 10, 20};
		
		nombreImpaire(tab);
		System.out.println("------------------------------");
		
		estPalindrome2("ghefe");
		String chaine = "qhq";
		if (estPalindrome2(chaine)) {
			System.out.println(chaine + " est palindrome");
		} else {
			System.out.println(chaine + " n'est pas palindrome");
		}
		
		System.out.println("------------------------------");
		
		System.out.println(calculAnnee(2000, 0.3, 10000));
			
		
		System.out.println();
	}	
	
	public static void nombreImpaire(int[] tab){
		int nombre = 0;
		for (int i : tab) {
			if (i % 2 != 0) {
				nombre++;
			}
		}
		System.out.println("nombre de valeur impaire : " + nombre);
	}
	
	public static String estPalindrome(String mot){
		if (mot.length() <= 1)
			return mot;
		else
		{
			String result = mot.charAt(mot.length() - 1) + estPalindrome(mot.substring(0, mot.length() - 1));
			
			return result;
			
		}
		

	}
	
	public static boolean estPalindrome2(String chaine){
		for (int i = 0 ; i < chaine.length() ; i++){
			if (chaine.charAt(chaine.length() - 1)  == chaine.charAt(i)) {
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
	// function reverse renvoi l inverse de la chaine
	// en faisant un stringBuilder avant
	
	public static int calculAnnee(int sommeInitial, double tauxAnnuel, int sommeAtteindre){
		double somme = sommeInitial + (sommeInitial * tauxAnnuel);
		int nombreAnnee = 0;
		while (somme < sommeAtteindre) {
			nombreAnnee++;
			somme = somme + sommeInitial;
		}
		return nombreAnnee;
	}
}
