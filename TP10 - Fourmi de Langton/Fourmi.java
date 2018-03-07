public class Fourmi {
    private int x;
    private int y;
    private int d;//0 haut 1 droite 2bas 3gauche
    
    public Fourmi(int x, int y){
        this.x = x;
        this.y = y;
        this.d = 0;
    }
    public void avance(boolean c){ //c=true si case noire
        if(c){ //case noire
            d=(d+1)%4;
            mouvoir(d);
        }
        else {
            d=(d+1)%4;
            mouvoir(d);
        }
    }
    private void mouvoir(int d){
      switch(d){
        case 0: x-=1;
            break;
        case 1: y+=1;
                break;
        case 2: x+=1;
                break;
        case 3: y-=1;
                break;
        }
    }
    public int getPosX(){return this.x;}
    public int getPosY(){return this.y;}
}
