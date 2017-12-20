public class PairImpair {
    public static void main(String[] args) {
        int n = 21;
        if(estPair(n)) {
            System.out.println("le nombre est pair");
        }
        else {
            System.out.println("le nombre est impair");
        }
    }
    public static boolean estPair(int n) {
        /*boolean result = false;
        if (n%2 == 0) {
            result = true;
        }
        return result;
        */
        return (n%2 == 0);
    }
}
