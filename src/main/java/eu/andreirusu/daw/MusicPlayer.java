package eu.andreirusu.daw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic music;

    // Injectam dependenta din exterior
    @Autowired
    public MusicPlayer(ClassicalMusic music) {
        this.music = music;
    }

    public void playMusic() {
    	// Cod pentru interpretarea muzicii
        System.out.println("Playing: " + music.getSong());
    }
}
