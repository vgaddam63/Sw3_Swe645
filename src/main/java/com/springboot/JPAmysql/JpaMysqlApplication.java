package com.springboot.JPAmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.springboot.JPAmysql.repository")
@SpringBootApplication
public class JpaMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaMysqlApplication.class, args);
	}

}
