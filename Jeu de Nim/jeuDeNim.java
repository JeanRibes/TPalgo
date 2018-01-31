import java.util.Scanner;
public class jeuDeNim {
    public static void main(String[] args) {
        int nbBat = (int)(Math.random()*10) + 15;
        printi(nbBat);
        while (nbBat > 1) {
            if(nbBat > 2) {
                nbBat -= tirerBat(4, nbBat);
            }
            else {System.out.println("Le joueur 1 a perdu");}
            if(nbBat >2){
                nbBat -= tirerBat(2, nbBat);
            }
            else {System.out.println("Le joueur 2 a perdu");}
        }
    }
    public static int tirerBat(int nJoueur, int nbBat) {
        Scanner sc = new Scanner(System.in);
        int nbPris = 0;
        while(nbPris < nbBat) {
            while (nbPris < 1 || nbPris > 3) {
                System.out.println("Joueur n°"+ nJoueur +", enlevez entre un et 3 batonnets");
                nbPris = sc.nextInt();
                printi(nbPris);
                print("Prenez un nombre correct");
            }
            if(nbPris > nbBat){System.out.println("Prenez moins que ce qu'il reste !");}
        }
        return nbPris;
    }
    public static void print(String msg) {System.out.println(msg);}
    public static void printi(int msg) {System.out.println(msg);}
}
