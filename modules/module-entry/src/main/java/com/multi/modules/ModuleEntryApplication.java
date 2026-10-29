package com.multi.modules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.multi.modules")
public class ModuleEntryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleEntryApplication.class, args);
	}

}
