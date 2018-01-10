import java.util.Scanner;
public class jeuNimProf {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] jeu = initialisationJeu();
		
		int numJoueur = 1;
		int N;
		int nbPions;
		
		while(!estFini(jeu)){
			affichageJeu(jeu);
			
			System.out.println("Joueur "+numJoueur+", à vous de jouer !");
			System.out.println("Quel tas ?");
			N = sc.nextInt();
			while(N<0 || N>(jeu.length-1) || jeu[N]==0){
				System.out.println("Probleme, faites un autre choix");
				N = sc.nextInt() - 1;
			}
			System.out.println("Nombre de pions ?");
			nbPions = sc.nextInt();
			while(nbPions<1 || nbPions > jeu[N]){
				System.out.println("Probleme, faites un autre choix");
				nbPions = sc.nextInt();
			}
			
			jeu[N] -= nbPions;
			
			if(numJoueur == 1){
				numJoueur = 2;
			} else {
				numJoueur = 1;
			}
		}
		System.out.println("Joueur "+numJoueur+", vous avez perdu !");
	}
	
	public static int[] initialisationJeu() {
		int nbTas = (int)(Math.random()*5)+3;
		int[] jeu = new int[nbTas];
		for(int i = 0; i<nbTas; i++){
			jeu[i] = (int)(Math.random()*11)+15;
		}
		return jeu;
	}
	public static void affichageJeu(int [] j){
		for(int i = 0; i<j.length; i++)
			System.out.print(j[i]+" ");
		System.out.println();
	}
	public static boolean estFini(int[] jeu) {
		int nbPions = 0;
		for(int i=0; i<jeu.length; i++) {
			nbPions += jeu[i];
		}
		if(nbPions >1)
			return false;
		else
			return true;
	}
}

