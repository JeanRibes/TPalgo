
import java.util.Scanner;
public class nombreSecret {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombreSecret = (int)(Math.random()*1000);
        //System.out.println("nS="+nombreSecret);
        System.out.println("À quel nombre pensez-vous ? :");
        int nombreTeste = sc.nextInt();
        int n=0; //compteur de tentatives
        while(nombreTeste != nombreSecret && n<10) {
            if(nombreTeste > nombreSecret) {
            System.out.println("-");
            }
            else {
            System.out.println("+");
            }
            System.out.println("Entrez un autre nombre? :");
            nombreTeste = sc.nextInt();
            n+=1;
        }
        if(n==10) {
            System.out.println("Raté !");
        }
        else {
            System.out.println("Bravo !");
        }
<<<<<<< HEAD
        System.out.println("Bravo !C'était bien "+nombreSecret);
=======
>>>>>>> 8ac5c0b0ea47417485668de51d9e22a7e08700df


        System.out.println();
    }
}
