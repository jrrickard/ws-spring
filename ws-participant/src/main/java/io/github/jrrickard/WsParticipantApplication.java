package io.github.jrrickard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class WsParticipantApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsParticipantApplication.class, args);
	}
}
