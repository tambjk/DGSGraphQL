package com.lbs.example.employeedirectory.queryspring.app;

import com.lbs.example.employeedirectory.queryspring.config.QueryServiceApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by Erman.Kaygusuzer on 22/06/2022
 */
@SpringBootApplication
@Import(QueryServiceApplicationConfiguration.class)
public class QueryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueryServiceApplication.class, args);
	}
}
