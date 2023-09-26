package com.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
		basePackages = { "aero.minova", "com.spring" }
)

@Slf4j
public class SpringBootStarter {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarter.class, args);
	}
}
