//jeu de nim avec plusieurs tas
import java.util.Scanner;
public class multiNim {
    public static void main(String[] args) {
        int nbTas =(int)(Math.random()*5)+3;
        int[] jeu = new int[nbTas];
        for(int i=0; i<nbTas;i++){
            jeu[i] = (int)(Math.random()*11)+15;
        }
    }
}
