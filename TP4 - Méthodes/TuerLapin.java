import java.util.Scanner;
public class TuerLapin {
    public static void main(String[] args) {
        int lapinX = (int)(Math.random()*10);
        int lapinY = (int)(Math.random()*10);
        double distance = 10;
        int essais = 1;
        while(distance > 0 && essais < 10) {
            int[] test = test();
            distance = distance(lapinX, lapinY, test);
            System.out.println("Vous êtes à "+distance+" du lapin et il vous reste "+(10-essais)+"essais");
            essais+=1;
        }
        if(essais<10) {
            System.out.println("Vous avez tué le lapin !");
        }
        else {
            System.out.println("Perdu ! Le lapin a muté en velociraptor !");
        }
    }
    public static double distance(int lapinX, int lapinY, int[] test) {
        double distance = Math.sqrt(Math.pow(lapinX - test[0],2)+Math.pow(lapinY - test[1], 2));
        return distance;
    }
    public static  int[] test() {
        Scanner sc = new Scanner (System.in);
        int[] test = new int[2];
        System.out.println("Entrez la coord X:");
        test[0] = sc.nextInt();
        System.out.println("Entrez la coord Y:");
        test[1] = sc.nextInt();
        return test;

    }

}
