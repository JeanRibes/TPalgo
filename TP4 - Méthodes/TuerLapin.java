import java.util.Scanner;
public class TuerLapin {
    public static void main(String[] args) {
        int lapinX = (int)(Math.random()*10);
        int lapinY = (int)(Math.random()*10);
        double distance = 10;
        while(distance > 0) {
            int[] test = test();
            distance = distance(lapinX, lapinY, test);
            System.out.println("Vous êtes à "+distance+" du lapin");
        }
        System.out.println("Vous avez tué le lapin !");
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
