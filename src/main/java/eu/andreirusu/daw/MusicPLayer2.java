package eu.andreirusu.daw;

public class MusicPLayer2 {
    private RockMusic music = new RockMusic();

    public void playMusic() {
        System.out.println("Playing: " + music.playSong());
    }
}