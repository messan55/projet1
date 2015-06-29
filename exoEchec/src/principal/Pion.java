package principal;

public class Pion extends Piece{
	
	public Pion(boolean couleur, int positionX, int positionY) {
		super(couleur, positionX, positionY);
	}

	@Override
	public String getMouvement() {
		int positionPionX = getPositionX() + 1;
		int positionPionY = getPositionY() + 1;
		return null;
	}
	
}
