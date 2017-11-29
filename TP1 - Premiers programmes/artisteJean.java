/** Artiste
* @author Vincent CHEUTET
*/

public class artisteJean { 
	
	public static void main(String[] args){
		// Première instruction
		Affichage.avancer(100);
		for(int i=0; i<8; i++) {
			Affichage.avancer(100);
			Affichage.tourner(true, 45);
		}
		/* Affichage final */
		Affichage.avancer(350);
		Affichage.tourner(true, 90);
		Affichage.avancer(300);
		for(int i=1; i<200; i++) {
			int j=i;
			while(j>9) {
				j=j-9;
			}
			Affichage.choixCouleur(j);
			Affichage.avancer(i);
			Affichage.tourner(true, 60);
			//Affichage.tourner(true, 40);
		}
		Affichage.afficher();
	}
}
