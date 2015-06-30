package principal;

import metier.*;

public class Program implements Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean tranferer(CompteBanquaire compteSource, CompteBanquaire compteDestination, int montant){
		if (montant > 0) {
			compteSource.retrait(montant);
			compteDestination.depot(montant);
			return true;
		} else {
			return false;
		}
			
	}
	
	public static void trier(){
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
