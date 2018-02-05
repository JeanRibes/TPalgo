/** Calcul vectoriel classique.
* @author Vincent CHEUTET
*/

public class CalculVectoriel {
	/*--------------------------------------------*/
	/*--------------------------------------------*/
	public static void afficheVecteur(double[] A){
		System.out.print("Vecteur A["+A.length+"] = | ");
		for(int i =0;i<A.length;i++)
			System.out.print(A[i]+" | ");
		System.out.println();
	}
	
	/*--------------------------------------------*/
	/*--------------------------------------------*/
	public static boolean compareVecteur(double[] A, double[] B){
		boolean res = true;
		
		if(A.length != B.length) res = false;
		else
		{
			for(int i=0; i<A.length;i++)
			{
				if(A[i]!=B[i]) res = false;
			}
		}
		return res;
	}

	/*--------------------------------------------*/
	/*--------------------------------------------*/
	public static double prodScalaire(double[] A, double[] B){
		double res = 0;
		for(int i=0; i<A.length;i++)
			res = res + A[i]*B[i];
		return res;
	}
	
	/*--------------------------------------------*/
	/*--------------------------------------------*/
	public static double[] sommeVecteurs(double[] A, double[] B){
		double[] res = new double[A.length];
		for(int i=0; i<A.length;i++)
			res[i] = A[i] + B[i];
		return res;
	}
	/*--------------------------------------------*/
	/*--------------------------------------------*/
	public static double normeVecteur(double[] A){
		return Math.sqrt(prodScalaire(A,A));
	}
	
	/*--------------------------------------------*/
	/*--------------------------------------------*/
	public static double prodMixte(double[] A, double[] B, double[] C){
		return prodScalaire(A,prodVectoriel(B,C));
	}
	
	/*--------------------------------------------*/
	/*--------------------------------------------*/
	public static double [] prodVectoriel(double[] A, double[] B){
		double[] res = new double[A.length];
		double[] Abis = new double[A.length+2];
		double[] Bbis = new double[B.length+2];
		int i;
		
		/* Initialisation */
		for(i=0;i<A.length;i++)
		{
			Abis[i] = A[i];
			Bbis[i] = B[i];
		}
		Abis[A.length] = A[0];
		Abis[A.length+1] = A[1];
		Bbis[B.length] = B[0];
		Bbis[B.length+1] = B[1];
		
		/* Calcul */
		for(i=0;i<res.length;i++)
			res[i] = Abis[i+1]*Bbis[i+2] - Abis[i+2]*Bbis[i+1];
		
		return res;
	}

	/*--------------------------------------------*/
	/*--------------------------------------------*/
	public static void main(String[] args){
		double[] A ={1,0,0};
		double[] B ={0,1,0};
		System.out.println("La norme du vecteur A vaut "+normeVecteur(A));
	}
}
