public class tab {
    public static void main (String[] args) {
        //double[] monTableau = new double[10];
        int[] t = {3,4,12,7,14,8};
        for (int i=0; i<t.length; i++) {
            System.out.print(" "+t[i]);
        }
        System.out.println();
        t[2]=0;
        t[4]=0;
        for (int i=0; i<t.length; i++) {
            System.out.print(" "+t[i]);
        }
        System.out.println();
        for (int i=0; i<t.length; i++) {
            if(t[i] != 0){
                System.out.print(" "+t[i]);
            }
        }
    }
}
