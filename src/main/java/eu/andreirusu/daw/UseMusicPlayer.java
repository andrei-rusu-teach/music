package eu.andreirusu.daw;

public class UseMusicPlayer {
	public static void main(String[] args) {
		MusicPlayer musicPlayer = new MusicPlayer(new ClassicalMusic());
		musicPlayer.playMusic();
	}
}
