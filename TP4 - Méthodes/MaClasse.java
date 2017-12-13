public class MaClasse {
    public static void main(String[] args) {
        for (int x=-5; x<=5; x++) {
            System.out.println(f(x));
        }
    }

public static int f(int x) {
    int y = x;
    if(x<0) {
        y = -2*x;
    }
    return(y);
}
}
