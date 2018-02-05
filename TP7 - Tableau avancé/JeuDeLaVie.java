/** Jeu de la vie.
* @author Vincent CHEUTET
*/
import java.util.Scanner;

public class JeuDeLaVie { 
	
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la hauteur voulue de votre monde :");
		final int H = sc.nextInt();
		System.out.println("Entrez la largeur voulue de votre monde :");
		final int L = sc.nextInt();
		System.out.println("Entrez le nombre d'iterations :");
		final int N = sc.nextInt();

		boolean [][] monde = genererMondeAleatoire(H,L, 0.5);
        afficherMonde(monde);
	}
    
	/** Affiche le contenu d’un monde
	*@param monde Le monde a afficher
	*/
	public static void afficherMonde (boolean[][] monde){
		// A compléter
	}
	
	
	/** Genere un monde rempli aleatoirement
	* @param hauteur : Hauteur du monde
	* @param largeur : Largeur du monde
    * @param proba : probabilite qu'une cellule soit vivante
	* @return Monde nouvellement cree
	*/
	public static boolean [][] genererMondeAleatoire(int hauteur, int largeur, double proba){
        // A compléter
	}
	
    public static void pause(int ms) {
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){}
    }

}
