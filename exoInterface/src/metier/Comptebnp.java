package metier;

public class Comptebnp implements CompteBanquaire{
	
	public double solde;	

	public Comptebnp(double solde) {
		super();
		this.solde = solde;
	}

	public double depot(double depot) {
		// TODO Auto-generated method stub
		return this.solde = solde + depot;
	}

	public double retrait(double retrait) {
		// TODO Auto-generated method stub
		return this.solde = solde - retrait;
	}

	public double consultation(double compte) {
		// TODO Auto-generated method stub
		return this.solde;
	}

}
