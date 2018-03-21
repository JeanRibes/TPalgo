public class Revision {
	
	public static void main (String args[]) {
		Chanson t1 = new Chanson("Hello", "Adele",5);
		Chanson t2 = new Chanson("Numb", "LinkinPark",4);
		Chanson t3 = new Chanson("Asereje", "Las Ketchup",20);
		Chanson t4 = new Chanson("Seven Nation Army", "The White Stripes",2);
		Chanson t5 = new Chanson("My immortal", "Evanescence",1);
		Playlist p = new Playlist("Ma Playlist", 5);
		p.playlist[0] = t1;
		p.playlist[1]= t2;
		p.playlist[3] = t3;
		p.playlist[4] = t4;
		p.playlist[2] = t5;
		System.out.println(p);
		p.lister();
		System.out.println("-----------------------");
		p.trier();
		p.lister();
		System.out.println("-----------------------rajout");
		Chanson t6 = new Chanson("Rockabye", "Clean Bandit", 15);
		p.rajout(t6);
		p.lister();
		System.out.println("-----------------------triage");
		p.trier();
		p.lister();
	}
}
