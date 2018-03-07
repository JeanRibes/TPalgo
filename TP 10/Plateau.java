
public class Plateau {
	
	public int taille;
	public boolean[][] etat;
	public Fourmi f;
	
	public Plateau(int taille){
		this.taille = taille;
		etat = new boolean[taille][taille];
		f = new Fourmi (taille/2,taille/2, 0);
	}
	
	public int getTaille(){
		return taille;
	}
	public boolean getEtat(int x, int y){
		return etat[x][y];
	}
	public int getFX(){
		return f.getX();
	}
	public int getFY(){
		return f.getY();
	}
	
	public void update(){
		int x = f.getX();
		int y = f.getY();
		boolean couleur = etat[x][y];
		f.avance(couleur);
		etat[x][y] = !couleur;
	}
}
