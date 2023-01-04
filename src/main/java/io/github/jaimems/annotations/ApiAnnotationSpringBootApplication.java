package io.github.jaimems.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiAnnotationSpringBootApplication {

	@Value("${application.name}")
	private String applicationName;
	
	@GetMapping("/ola-mundo")
	public String olaMundo() {
		return applicationName;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiAnnotationSpringBootApplication.class, args);
	}

}
