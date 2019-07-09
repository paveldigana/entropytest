package cz.digana.entropytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
public class EntropyTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntropyTestApplication.class, args);
	}
}
