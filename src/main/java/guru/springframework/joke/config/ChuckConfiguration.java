package guru.springframework.joke.config;

import org.springframework.context.annotation.Bean;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by jt on 5/25/17.
 */
//@Configuration
public class ChuckConfiguration {

	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

}
