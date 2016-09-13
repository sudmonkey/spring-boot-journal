package io.sudmonkey;

import io.sudmonkey.domain.Journal;
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
	        repository.save(new Journal("Get to know Spring Boot", "Today I will learn Spring Boot", "10/09/2016"));
	        repository.save(new Journal("Simple Spring Boot project", "I will make my first Spring Boot project", "10/09/2016"));
	        repository.save(new Journal("Spring Boot reading", "Read more about Spring Boot", "11/09/2016"));
	        repository.save(new Journal("Spring Boot in the Cloud", "Spring Boot using Cloud Foundry", "12/09/2016"));
        };
    }
}
