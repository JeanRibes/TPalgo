import java.util.Scanner;

public class RechercheElementTableau {
    
    public static void main(String[] args) {
        
        int[] t = {3, 12, 20, 15, 18, 16, 14, 18, 13};
        
        Scanner sc = new Scanner(System.in) ;
        //affichage pour l'utilisateur
        System.out.println("De quel entier cherchez-vous la position ?");
        //obtention de la valeur saisie au clavier
        int valeurCherchee = sc.nextInt();
        int index = -1;
        System.out.println("Vous cherchez la valeur : "+ valeurCherchee);

        int i=0;
        while((t[i] != valeurCherchee) && (i< t.length -1 )) {
            i++;
        }
        if(t[i]==valeurCherchee) {
            System.out.println(i);
        }
        else {System.out.println(-1);}
        
        // jeu de tests
        //ecrire ici les valeurs a tester et pourquoi
    }

}
