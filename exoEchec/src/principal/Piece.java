package principal;

public abstract class Piece {

	private boolean couleur;
	private int positionX;
	private int positionY;
	
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
	
	public abstract String getMouvement(int positionX, int positionY);
	
}
