package eu.andreirusu.daw;

public class UseMusicPlayer {
	public static void main(String[] args) {
		// Ultima problema: totusi inca trebuie undeva sa cream direct 
		// in aplicatie obiectele necesare. Deci codul este inca 
		// cuplat intre obiectele sale. 
		
		// Solutia: Spring Framework + Application Context unde se vor crea toate 
		// obiectele necesare in aplicatie
		MusicPlayer musicPlayer = new MusicPlayer(new ClassicalMusic());
		musicPlayer.playMusic();
	}
}
