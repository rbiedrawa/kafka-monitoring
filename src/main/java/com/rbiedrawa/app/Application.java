package com.rbiedrawa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Application {
	public static final String EVENTS_TOPICS = "hello.events";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
