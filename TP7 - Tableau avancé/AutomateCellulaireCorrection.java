import java.util.Scanner;

public class AutomateCellulaireCorrection {
	
	public static void main (String args[]) {
        final int TAILLE = 40;
        final int ITERATION = 15;
        boolean[][] cell = new boolean[ITERATION][TAILLE];
        cell[0][TAILLE/2] = true;
        Affichage.afficherMonde(cell);
        
        for(int i=0; i<ITERATION-1;i++){
            pause(250);
            //cell = evolutionJeu1(cell);
            //cell = evolutionJeu2(cell);
            //cell = evolutionJeu3(cell);
            cell[i+1] = evolutionJeu1(cell[i]);
            Affichage.afficherMonde(cell);
        }
	}
    
    public static boolean[] evolutionJeu1(boolean[] t){
        boolean[] r = new boolean[t.length];
        for(int i=1; i<t.length-1; i++){
            if(!t[i-1] && !t[i] && !t[i+1])
                r[i] = false;
            else
                r[i] = true;
        }
        return r;
    }

    public static boolean[] evolutionJeu2(boolean[] t){
        boolean[] r = new boolean[t.length];
        for(int i=1; i<t.length-1; i++){
            if(!t[i-1] && !t[i] && !t[i+1])
                r[i] = false;
            else if (!t[i-1] && t[i] && !t[i+1])
                r[i] = false;
            else
                r[i] = true;
        }
        return r;
    }

    public static boolean[] evolutionJeu3(boolean[] t){
        boolean[] r = new boolean[t.length];
        for(int i=1; i<t.length-1; i++){
            if(!t[i-1] && !t[i] && !t[i+1])
                r[i] = false;
            else if (t[i-1] && t[i] && t[i+1])
                r[i] = false;
            else
                r[i] = true;
        }
        return r;
    }
    
    public static boolean[] evolutionJeu4(boolean[] t){
        boolean[] r = new boolean[t.length];
        for(int i=1; i<t.length-1; i++){
            if(!t[i-1] && !t[i] && !t[i+1])
                r[i] = false;
            else if (t[i-1] && t[i] && t[i+1])
                r[i] = false;
            else if (t[i-1] && t[i] && !t[i+1])
                r[i] = false;
            else if (t[i-1] && !t[i] && t[i+1])
                r[i] = false;
            else
                r[i] = true;
        }
        return r;
    }
    
    public static void pause(int ms) {
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){}
    }
}

