package eu.andreirusu.daw;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Beautiful Britain ROCK ...";
	}

}
