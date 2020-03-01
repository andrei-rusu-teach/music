package eu.andreirusu.daw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private ClassicalMusic classicalMusic;
	private RockMusic rockMusic;

	@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
		super();
		this.classicalMusic = classicalMusic;
		this.rockMusic = rockMusic;
	}

	public void playMusic() {
    	// Cod pentru interpretarea muzicii
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
    }
}
