package com.chloefavkaomoji.kaomojimanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.chloefavkaomoji.kaomojimanager") // Root package to scan for components
@EnableJpaRepositories(basePackages = "com.chloefavkaomoji.kaomojimanager.repo") // Package to scan for repositories
@EntityScan(basePackages = "com.chloefavkaomoji.kaomojimanager.model") // Package to scan for entities

public class PoolPlayerManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoolPlayerManagerApplication.class, args);
	}

}
