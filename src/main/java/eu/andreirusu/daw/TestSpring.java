package eu.andreirusu.daw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
        
		Music music = context.getBean("musicBean", Music.class);
        // Oricum inca cream obiecte direct din aplicatie, deci
		// inca avem o cuplare a obiectelor ...

//		MusicPlayer musicPlayer = new MusicPlayer(music);
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();

        context.close();
	}

}
