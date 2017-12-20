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
            if(min = t[i]) { indiceMin=i;}

        }
    }
}
