package com.example.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class KubernetesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesExampleApplication.class, args);
	}

}
