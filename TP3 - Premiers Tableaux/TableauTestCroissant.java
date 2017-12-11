public class TableauTestCroissant {
    public static void main(String[] args) {
        int[] t = {5,4,3,2};
//        int[] t ={4,6,8,20,30,31,39};
        boolean croissant = true;
        for (int i=0; i<t.length; i++) {
            if (i!=t.length-1) { 
                if (t[i]<t[i+1] && croissant) {croissant=true;}
                else {croissant=false;}
            }
        }
        boolean decroissant = true;
        for (int i=0; i<t.length; i++) {
            if (i!=t.length-1) { 
                if (t[i]>t[i+1] && decroissant) {decroissant=true;}
                else {decroissant=false;}
            }
        }
        if(croissant) {System.out.println("le tableau est croissant");}
        if(decroissant) {System.out.println("Le tableau est décroissant");}
        if(!croissant && !decroissant) {System.out.println("Le tableau n'est ni croissant, ni décroissant");}
    }
}
