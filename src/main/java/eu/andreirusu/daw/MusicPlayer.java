package eu.andreirusu.daw;

public class MusicPlayer {
    private ClassicalMusic music = new ClassicalMusic();

    public void playMusic() {
        System.out.println("Playing: " + music.playSong());
    }
}
