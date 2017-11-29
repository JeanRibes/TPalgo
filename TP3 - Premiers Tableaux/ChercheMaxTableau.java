
public class ChercheMaxTableau {

     public static void main(String[] args) {
        
        //le maximum se trouve dans une case quelconque
        //resultat attendu 12.5 - position : 2
        double[] t = {3.2, 5.1, 12.5, 7.5, 8.8, 4.9};
        double max = 0;
        for (int i=0; i<t.length;i++)  {
            if(t[i]>max) {
                max = t[i];
            }
        }
        System.out.println(max);
        for (int i=0; i<t.length;i++) {
            if(max == t[i]) {
                System.out.println(i);
            }
        }
        //le tableau comporte 1 seul element
        //resultat attendu 1.3 - position : 0
        double[] t1 = {1.3} ;
        System.out.println("Second tableau (t1)");
        max = 0;
        for (int i=0; i<t1.length;i++)  {
            if(t1[i]>max) {
                max = t1[i];
            }
        }
        System.out.println(max);
        for (int i=0; i<t1.length;i++) {
            if(max == t1[i]) {
                System.out.println(i);
            }
        }
        //le max est le 1er element
        //resultat attendu 14.4 - position : 0
        double[] t2 = {14.4, 5.1, 12.5, 7.5, 8.8, 4.9};
        System.out.println("3e tableau (t2), on attend 14.4 et 0");
        max = 0;
        for (int i=0; i<t2.length;i++)  {
            if(t2[i]>max) {
                max = t2[i];
            }
        }
        System.out.println(max);
        for (int i=0; i<t2.length;i++) {
            if(max == t2[i]) {
                System.out.println(i);
            }
        }
        //le max est le dernier element
        System.out.println("4e tableau - resultat attendu 14.9 - position : 5");
        double[] t3 = {3.2, 5.1, 12.5, 7.5, 8.8, 14.9};
        max = 0;
        for (int i=0; i<t3.length;i++)  {
            if(t3[i]>max) {
                max = t3[i];
            }
        }
        System.out.println(max);
        for (int i=0; i<t3.length;i++) {
            if(max == t3[i]) {
                System.out.println(i);
            }
        }
        //temperatures moyennes a Lyon-Bron en 2016
        //d'apres www.infoclimat.fr
        //resultat attendu 22.6 - position : 6
        double[] temperatures = {6.9, 7.0, 7.6, 12.1, 15.2, 20.0, 22.6, 22.6, 20.4, 12.0, 8.5, 3.0 };
        
        //recherche de l'element de valeur maximum
    }

}
