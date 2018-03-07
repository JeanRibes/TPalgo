public class Plateau {
    public int taille;
    public boolean[][] etat;
    public Fourmi f;

    public Plateau(int taille) {
         this.taille = taille;
         etat = new boolean[taille][taille];
         f = new Fourmi(taille/2, taille/2);
    }
    public void update() {
        int x = f.getPosX();
        int y = f.getPosY();
        boolean color = etat[x][y];
        f.avance(color);
        etat[x][y]=!color;
    }
}
