package com.verng.helloutil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloutilApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloutilApplication.class, args);
	}

	/**
	 * My introduction to spring boot application.
	 * @param name - specify the person name.
	 * @param age - specify the person age.
	 * @return
	 */
	@GetMapping("/introduction")
	public String introduction(@RequestParam(value = "name", defaultValue = "World!") String name,
							   @RequestParam(value = "age", defaultValue = "20") int age) {
		return String.format("Hello %s, my age is %d!", name, age);
	}
}
