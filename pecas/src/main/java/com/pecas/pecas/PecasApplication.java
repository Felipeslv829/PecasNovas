package com.pecas.pecas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.pecas.PecasRepository")
@EntityScan("com.pecas.models")
@ComponentScan("com.pecas.controller")
@SpringBootApplication
public class PecasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PecasApplication.class, args);
	}

}
