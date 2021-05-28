package com.sai.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyCnvtrServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyCnvtrServiceApplication.class, args);
	}

}
