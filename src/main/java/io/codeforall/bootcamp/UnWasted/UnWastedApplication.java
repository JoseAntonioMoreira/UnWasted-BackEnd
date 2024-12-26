package io.codeforall.bootcamp.UnWasted;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "io.codeforall.bootcamp.UnWasted.Models")
public class UnWastedApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnWastedApplication.class, args);


	}

}
