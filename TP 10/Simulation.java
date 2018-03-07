

public class Simulation {
	public static void main (String args[]){
		int taille = 10;
		//AffichageFourmi.setResolution(1000/taille);
		//AffichageFourmi.setDelay(10);
		Plateau p = new Plateau(taille);
		AffichageFourmi.afficherMonde(p);
		
		while(true){
			p.update();
			AffichageFourmi.afficherMonde(p);
		}
	}
}

