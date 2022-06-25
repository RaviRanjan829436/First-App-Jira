package com.datajpapractice.page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
public class DataJpaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaPracticeApplication.class, args);
	}

}
