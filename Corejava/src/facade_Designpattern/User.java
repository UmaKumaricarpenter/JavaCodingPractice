package facade_Designpattern;

public class User {
	
	public static void main(String[] args) {
		
		Television tv = new Television();
		
		SoundSystem ss = new SoundSystem();
		
		RoomLight rl = new RoomLight();
		
		HomeTheaterfacad facad = new HomeTheaterfacad(tv, ss, rl);
		
		facad.watchMovie();
		
		facad.stopMovie();
	}

}
