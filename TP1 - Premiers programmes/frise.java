/** Artiste
* @author Vincent CHEUTET
*/

public class frise { 
	
	public static void main(String[] args){
		// Première instruction
		Affichage.choixCouleur(2);
		for (int i=0; i< 50; i++) {
			Affichage.avancer(30);
			Affichage.tourner(false, 90);
			Affichage.avancer(50);
			Affichage.tourner(true, 90);
			Affichage.avancer(50);
			Affichage.tourner(true, 90);
			Affichage.avancer(40);
			Affichage.tourner(true, 90);
			Affichage.avancer(10);
			Affichage.tourner(true, 90);
			Affichage.avancer(30);
			Affichage.tourner(false, 90);
			Affichage.avancer(30);
			Affichage.tourner(false, 90);
			Affichage.avancer(40);
			Affichage.tourner(false, 90);
			Affichage.avancer(50);
		}
		Affichage.afficher();
	}
}
