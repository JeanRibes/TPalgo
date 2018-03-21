public class Chanson {
	public String titre;
	public String artiste;
	public int note;

	public Chanson(String titre, String artiste, int note){
		this.titre = titre;
		this.artiste = artiste;
		this.note = note;
	}
	public String toString(){
		return this.titre+" - "+this.artiste;
	}
    
}
