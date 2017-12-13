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
        System.out.println("Vous cherchez la valeur : "+ valeurCherchee+'\n');

        int i=0;
        while((t[i] != valeurCherchee) && (i< t.length -1 )) {
            i++;
        }
        if(t[i]==valeurCherchee) {
            System.out.println("La valeur "+valeurCherchee+" est à l'indice "+i);
        }
        else {System.out.println(valeurCherchee+" n'est pas dans le tableau");}
        
        // jeu de tests
        //ecrire ici les valeurs a tester et pourquoi
        //"CORRECTION"
        i=0;
        int indice = -1;
        while(i<t.length && indice == -1) {
            if(t[i]==valeurCherchee) {indice = i;}
            i++;
        }
        System.out.println('\n'+"2e méthode : "+indice);
    }

}
