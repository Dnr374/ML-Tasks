package com.bhavna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringConfigNoukriServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigNoukriServiceApplication.class, args);
	}

}
