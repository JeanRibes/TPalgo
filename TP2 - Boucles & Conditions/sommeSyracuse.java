public class sommeSyracuse {
    public static void main (String[] args) {
        int N=1100000;
        double u=500;
        for(int i=0; i<N; i++) {
            if(u%2==0) {
                u=u/2;
            }
            else {
                u=3*u+1;
            }
        }
        System.out.println(u);
    }
}
