
public class Fourmi {
	
	public int x; // position x 
	public int y; // position y 
	public int d; // direction : 0 vers le haut , 1 vers la droite , 2 vers le bas , 3 vers la gauche
	
	//Constructeur
	public Fourmi(int x, int y, int d){
		this.x = x;
		this.y = y;
		this.d = d;
	}
	
	// deplacement
	// c false si case initiale blanche, true sinon 
	public void avance (boolean c) {
		if (c == false){
			d = (d+3)%4;
			switch (d){
				case 0 : x = x - 1;
				break;
				case 1 : y = y + 1;
				break;
				case 2 : x = x + 1;
				break;
				case 3 : y = y - 1;
				break;
			}
		}	
		else {
			d = (d+1)%4;
			switch (d){
				case 0 : x = x - 1;
				break;
				case 1 : y = y + 1;
				break;
				case 2 : x = x + 1;
				break;
				case 3 : y = y - 1;
				break;
			}
		}
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getD(){
		return d;
	}
}
