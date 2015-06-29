package principal;

public abstract class Piece {

	private boolean couleur;
	private int positionX;
	private int positionY;
	
	public Piece(boolean couleur, int positionX, int positionY) {
		// TODO Auto-generated constructor stub
		this.couleur = couleur;
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public boolean isCouleur() {
		return couleur;
	}
	
	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}
	
	public int getPositionX() {
		return positionX;
	}
	
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	public int getPositionY() {
		return positionY;
	}
	
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	public abstract String getMouvement();
	
}
