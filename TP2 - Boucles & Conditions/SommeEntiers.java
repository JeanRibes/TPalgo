
public class SommeEntiers {
	
	public static void main (String[] args) {
		int N=10;
		int n1=0;
		for(int i=0;i<=N;i++) {
			n1=n1+i;
		}
		System.out.println(n1);
        int n2=0;
        int j=0;
        while (j<N) {
            j++;
            n2+=j;
        }
        System.out.println(n2);
}
}

