public class NombreParfait {
    public static void main(String[] args) {
        for(int n=1; n<1000000; n++) {
            estParfait(n);
        }
    }
    public static boolean estDivisible(int n, int p){
        return (n%p == 0);
    }
    public static boolean estParfait(int n){
        int somme = 0;
        for(int i=1; i<n; i++)
            if(n%i == 0) {somme+=i;}
        if(somme == n) {
            System.out.println(n+" est parfait");
        }
        return (somme == n);
    }
}
