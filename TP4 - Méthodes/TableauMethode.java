public class TableauMethode {
    public static void main(String[] args) {
        int[] tab = {-4, 5, -2, 10};
        afficheTab(tab);

    }
    public static void afficheTab(int[] t) {
        for(int i=0; i<t.length; i++) {
            System.out.println(t[i]);
        }
    }
    public static int indicePlusPetit(int[] t) {
        int min = 0;
        
        for (int i=0; i<t.length; i++) {
            if(t[i] < min) {
                min = t[i];
            }
        }
        int indiceMin=0;
        for (int i=0; i<t.length; i++) {
            if(min == t[i]) { indiceMin=i;}
        }
        return indiceMin;
    }
    public static double moyenne(int[] t) {
        int n = t.length;
        int somme = 0;
        for(int i=0; i<t.length; i++) {
            somme += t[i];
        }
        return somme/n;
    }
    public static double ecartType(int[] t, double moyenne) {
        int somme = 0;
        for(int i=0; i<t.length; i++) {
            somme += t[i];
        }
        for (int i=0;i<t.length;i++) {
            somme+=Math.pow(t[i]-moyenne, 2);
        }
        /*double ecartType = Math.sqrt(somme/t.length);
        return ecartType;*/
        return Math.sqrt(somme/t.length);
    }
}
