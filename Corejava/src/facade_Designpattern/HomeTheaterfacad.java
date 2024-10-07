package facade_Designpattern;

public class HomeTheaterfacad {
	
	Television tv;
	
	SoundSystem ss;
	
	RoomLight rl;

	public HomeTheaterfacad(Television tv, SoundSystem ss, RoomLight rl) {
	
		this.tv = tv;
		this.ss = ss;
		this.rl = rl;
	}
	
	public void watchMovie() {
		
		System.out.println("Wathching movie: ");
		tv.switchOnTv();
		ss.switchOnSoundSystem();
		rl.lightDim();
	}
	
   public void stopMovie() {
		
	    System.out.println("Stop wathching movie: ");
		tv.switchOffTv();
		ss.switchOffSoundSystem();
		rl.lightBright();
	}
	

}
