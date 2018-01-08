import java.util.Scanner;
 public class jeuNim {
    public static void main(String[] args) {
        int nbBat = (int)(Math.random()*11)+15;
        int numJ = 1;
        while(nbBat > 1){
            nbBat = nbBat - tirerBat(numJ, nbBat);
            if(numJ == 1){numJ = 2;}
            else {numJ = 1;}
        }
        System.out.println("Le joueur "+numJ +" a perdu");
    }
    public static int tirerBat(int numJ, int nbBat) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Il y a "+nbBat);
        System.out.println("joueur"+numJ+" tirez entre 1 et 3 batonnets");
        int nbPris = sc.nextInt();
        while(nbPris < 1 || nbPris >3){
            System.out.println("joueur"+numJ+" tirez entre 1 et 3 batonnets");
            nbPris = sc.nextInt();
        }
        return nbPris;
    }
}
