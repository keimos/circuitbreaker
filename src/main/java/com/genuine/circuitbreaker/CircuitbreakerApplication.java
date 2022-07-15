package com.genuine.circuitbreaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class CircuitbreakerApplication {

	public final Logger logger = LoggerFactory.getLogger(CircuitbreakerApplication.class);

	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss SSS");

	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerApplication.class, args);
	}

}
