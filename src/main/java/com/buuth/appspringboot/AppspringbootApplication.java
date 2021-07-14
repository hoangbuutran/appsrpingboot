package com.buuth.appspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@MapperScan(basePackages = {"com.buuth.appspringboot.repositoris"})
@ComponentScan(basePackages = {"com.buuth.appspringboot"})
@EntityScan("com.buuth.appspringboot.entity")
@EnableJpaRepositories("com.buuth.appspringboot.repositoris")
public class AppspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppspringbootApplication.class, args);
    }
}
