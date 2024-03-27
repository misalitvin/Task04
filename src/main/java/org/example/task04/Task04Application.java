package org.example.task04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Task04Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Task04Application.class, args);
	}
}