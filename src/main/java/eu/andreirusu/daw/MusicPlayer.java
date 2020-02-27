package eu.andreirusu.daw;

public class MusicPlayer {
    private Music music;

    // Injectam dependenta din exterior
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public void setMusic(Music music) {
		this.music = music;
	}

	public void playMusic() {
    	// Cod pentru interpretarea muzicii
        System.out.println("Playing: " + music.getSong());
    }
}
