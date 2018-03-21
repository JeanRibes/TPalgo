public class Playlist {
	public Chanson[] playlist;
	public String titre;

	public Playlist(String titre, int taille) {
		this.titre = titre;
		this.playlist = new Chanson[taille];
	}

	public String toString() {
		return this.titre+" "+this.playlist.length+" chansons";
	}
	public void trier(){
		int inversions = 1;
		while(inversions > 0){
			inversions -= 1;
			for(int i=1;i<playlist.length;i++){
				if(playlist[i-1].note > playlist[i].note){
					Chanson temp = playlist[i];
					playlist[i]=playlist[i-1];
					playlist[i-1] = temp;
					inversions+=1;
				}
			}
		}
	}

	public void lister() {
		for(Chanson c: playlist){
			System.out.println(c);
		}
	}
/*	public void rajout(Chanson chanson) {
		Chanson[] precedent = this.playlist;
		this.playlist = new Chanson[precedent.length+1];
		for(int i=0;i<=this.playlist.length;i++) {
			playlist[i] = precedent[i];
		}
		this.playlist[precedent.length] = chanson;
	}*/
	public void rajout(Chanson nouveau){
		Chanson[] changé = new Chanson[this.playlist.length+1];
		for(int i=0;i<this.playlist.length;i++){changé[i] = this.playlist[i];} //copie tu tableau
		changé[this.playlist.length] = nouveau; //rajout au bout
		this.playlist = changé; //swap
		this.trier();
	}

}
