package com.buuth.appspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.buuth.appspringboot"})
@EntityScan("com.buuth.appspringboot.entity")
@EnableJpaRepositories("com.buuth.appspringboot.repository")
public class AppspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppspringbootApplication.class, args);
	}

}
