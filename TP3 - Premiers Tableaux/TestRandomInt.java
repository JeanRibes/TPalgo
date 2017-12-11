public class TestRandomInt {
    public static void main(String[] args) {
        int[] tableauNombres = new int[10];
        for(int i=0; i<99; i++) {
            int nombreAlea = (int)(Math.random()*10)+1;
            tableauNombres[nombreAlea-1]++;
        }

        for (int i=0; i<=10; i++) {System.out.print(i+",");}
        System.out.println();
        for (int i=0; i<=10; i++) {System.out.print(tableauNombres[i]+",");}
    }
}
