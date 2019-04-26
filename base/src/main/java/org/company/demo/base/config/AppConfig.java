package org.company.demo.base.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@PostConstruct
	private void init() {
		System.out.println("###App Config From Base called###");
	}
}
