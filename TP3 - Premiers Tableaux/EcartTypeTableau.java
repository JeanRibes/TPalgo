public class EcartTypeTableau {
    public static void main(String[] args) {
        double[] tab = {3.2, 5.1, 12.5, 7.5, 8.8, 4.9};
        double somme = 0;
        for (int i=0; i<tab.length;i++) {somme+=tab[i];}
        double moyenne = (somme/tab.length);
        System.out.println(moyenne);
        somme = 0;
        for (int i=0;i<tab.length;i++) {somme+=Math.pow(tab[i]-moyenne, 2);}
        double ecartType = Math.sqrt(somme/tab.length);
        System.out.println(ecartType);
    }
}
