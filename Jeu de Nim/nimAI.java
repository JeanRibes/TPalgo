import java.util.Scanner;
public class nimAI {
    public static void main(String[] args) {
        int nbBat = (int)(Math.random()*11)+15;
        boolean joueur = true;
        while(nbBat > 1){
            if(joueur){
                nbBat -= humBat(nbBat);
            }
            else {
                int ai = aiBat(nbBat);
                nbBat -= ai;
            }
            if(nbBat > 1){
                if(joueur)
                    joueur = false;
                else
                    joueur = true;
            }
        }
        if(joueur){System.out.println("Vous avez gagné");}
        else{
            System.out.println("Il reste "+nbBat+" bâtonnets");
            System.out.println("Vous avez perdu");
        }
    }
    public static int humBat(int nbBat){
        Scanner sc = new Scanner(System.in);
        System.out.println("Il y a "+ nbBat +" bâtonnets");
        System.out.println("Prenez entre 1 et 3 bâtonnets");
        int nbPris = sc.nextInt();
        while (nbPris<1 || nbPris>3){
            System.out.println("Prenez entre 1 et 3 bâtonnets");
            nbPris = sc.nextInt();
        }
        if(nbPris > nbBat){
            System.out.println("Vous avez pris plus de batonnets que ce qu'il reste");
            while (nbPris<1 || nbPris>3){
                System.out.println("Prenez entre 1 et "+nbBat+" bâtonnets");
                nbPris = sc.nextInt();
            }
        }
        return nbPris;
    }
    public static int aiBat(int nbBat){
        int decision = nbBat%4;
        int nbPris = 0;
        switch(decision){
            case 0:
                nbPris = 3;
                break;
            case 1:
                nbPris = (int)(Math.random()*3)+1;
                break;
            case 2:
                nbPris = 1;
                break;
            case 3:
                nbPris = 2;
                break;
        }
        System.out.println("L'ordinateur a pris "+ nbPris +" bâtonnets parmi "+nbBat);
        return nbPris;
    }
}
