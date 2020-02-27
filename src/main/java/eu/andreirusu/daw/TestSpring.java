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
		MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
		
		boolean comparison = (musicPlayer == musicPlayer2);
		System.out.println(musicPlayer);
		System.out.println(musicPlayer2);
		System.out.println(comparison);
		
		musicPlayer.setVolume(10);
		System.out.println(musicPlayer.getVolume());
		System.out.println(musicPlayer2.getVolume());
		
		musicPlayer.playMusic();
		System.out.println("Name   = "+musicPlayer.getName());
		System.out.println("Volume = "+musicPlayer.getVolume());

        context.close();
	}

}
