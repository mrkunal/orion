package org.company.demo.child;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "org.company.demo.base.*" })
public class ChildApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChildApplication.class, args);
	}

}
