/** Artiste
* @author Vincent CHEUTET
*/

public class ArtisteAtelier1 { 
	
	public static void main(String[] args){
		// Première instruction
		Affichage.tourner(true, 45);
		Affichage.avancer(50);
		Affichage.tourner(true, 90);
		Affichage.avancer(50);
		Affichage.tourner(true, 90);
		Affichage.avancer(50);
		Affichage.tourner(true, 90);
		Affichage.avancer(50);
		Affichage.tourner(true, 45);
		Affichage.avancer(50);
		Affichage.tourner(false, 90);
		Affichage.avancer(50);
		Affichage.tourner(false, 90);
		Affichage.avancer(50);
		Affichage.tourner(false, 90);
		Affichage.avancer(50);
		/* Affichage final */
		Affichage.afficher();
	}
}
