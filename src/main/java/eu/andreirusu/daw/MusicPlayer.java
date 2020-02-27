package eu.andreirusu.daw;

public class MusicPlayer {
    private Music music;
    
	private String name;
    private int volume;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

   
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
