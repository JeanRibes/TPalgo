public class adn {
	
	public static void main (String args[]) {
		char[] brin = creation(20);
		affiche(brin);
		affiche(duplique(brin));
	}
	public static char[] creation(int taille) {
		char[] brin = new char[taille];
		for (int i=0; i<taille; i++) {
			int nucleotide = (int)(Math.random()*4);
			switch(nucleotide){
				case 0:
					brin[i] = 'A';
					break;
				case 1:
					brin[i] = 'T';
					break;
				case 2:
					brin[i] = 'C';
					break;
				case 3:
					brin[i] = 'G';
					break;
				}
		}
		return brin;
	}
	public static void affiche(char[] brin){
		for (int i=0; i<brin.length; i++) {
			System.out.print(brin[i]);
		}
		System.out.println();
	}
	public static char[] duplique(char[] brin) {
		char [] duplique = new char[brin.length];
		for (int i=0; i<brin.length; i++) {
			switch(brin[i]) {
				case 'A':
					duplique[i] = 'T';
					break;
				case 'T':
					duplique[i] = 'A';
					break;
				case 'C':
					duplique[i] = 'G';
					break;
				case 'G':
					duplique[i] = 'C';
					break;
			}
		}
		return duplique; 
	}
}

