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
       // afficherMonde(monde);
		Affichage.afficherMonde(monde);
		for(int i=0; i<N;i++){
			monde = evolution(monde, 0.5);
			Affichage.afficherMonde(monde);
			System.out.println("évolution !");
			pause(250);	
		}
	}
    	/** Modifie le jeu
	*@param monde le monde actuel
	*@param proba
	*@param return nouveau monde
	*/
	public static boolean[][] evolution(boolean[][]monde, double proba){
		int hauteur = monde.length;
		int largeur = monde[0].length;
		boolean[][] m2 = new boolean[hauteur][largeur];
		for(int y=1;y<hauteur-1;y++){
			for(int x=1; x<largeur-1;x++) {
				m2[y][x] = evoluerCell(y,x,monde);
			}
		}
		System.out.println("évolué, n°");
		return m2;
	}
	public static boolean evoluerCell(int y, int x, boolean[][] monde) {
		int somme=0;
		for(int i=y-1;i<y+1;i++){
		  for(int j=x-1;j<x+1;j++) {
			if(monde[y][x])
				somme+=1;
		  }
		}
//System.out.println(somme);
		if(somme>=1 && somme <=4)
		  return true;
		else
		  return false;
	}
	/** Affiche le contenu d’un monde
	*@param monde Le monde a afficher
	*/
	public static void afficherMonde (boolean[][] monde){
		for(int y=0; y<monde.length; y++){
			for(int x=0; x<monde[y].length; x++) {
				if(monde[y][x])
					System.out.print("|O");
				else
					System.out.print("|.");

			}
			System.out.println("|");
		}
		System.out.println("--------------------------------------------");
	}	
	
	/** Genere un monde rempli aleatoirement
	* @param hauteur : Hauteur du monde
	* @param largeur : Largeur du monde
        * @param proba : probabilite qu'une cellule soit vivante
	* @return Monde nouvellement cree
	*/
	public static boolean [][] genererMondeAleatoire(int hauteur, int largeur, double proba){
        	boolean mondeAlea[][] = new boolean[hauteur][largeur];
		for(int y=0;y<hauteur;y++){
			for(int x=0; x<largeur; x++) {
				if(Math.random()<proba)
					mondeAlea[y][x]=true;
			}
		}
		return mondeAlea;
	}
	
    public static void pause(int ms) {
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){}
    }

}

