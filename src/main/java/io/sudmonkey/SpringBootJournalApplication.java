package io.sudmonkey;

import io.sudmonkey.domain.JournalEntry;
import io.sudmonkey.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}

	@Bean
    InitializingBean saveData(JournalRepository repository) {
	    return () -> {
	        repository.save(new JournalEntry("Get to know Spring Boot", "Today I will learn Spring Boot", "2016-09-10"));
	        repository.save(new JournalEntry("Simple Spring Boot project", "I will make my first Spring Boot project", "2016-09-10"));
	        repository.save(new JournalEntry("Spring Boot reading", "Read more about Spring Boot", "2016-09-11"));
	        repository.save(new JournalEntry("Spring Boot in the Cloud", "Spring Boot using Cloud Foundry", "2016-09-12"));
        };
    }
}
