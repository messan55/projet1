package metier;

public class Comptelcl implements CompteBanquaire{
	
	public double solde;	

	public Comptelcl(double solde) {
		super();
		this.solde = solde;
	}

	@Override
	public double depot(double depot) {
		// TODO Auto-generated method stub
		return this.solde = solde + depot;
	}

	@Override
	public double retrait(double retrait) {
		// TODO Auto-generated method stub
		return this.solde = solde - retrait;
	}

	@Override
	public double consultation(double compte) {
		// TODO Auto-generated method stub
		return this.solde;
	}

}
