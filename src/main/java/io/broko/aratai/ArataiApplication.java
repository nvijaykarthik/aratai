package io.broko.aratai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ArataiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ArataiApplication.class, args);
	}
}
