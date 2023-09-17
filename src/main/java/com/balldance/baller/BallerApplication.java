package com.balldance.baller;

import com.balldance.baller.model.User;
import com.balldance.baller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BallerApplication {
	@Autowired
	private UserService mUserService;

	public static void main(String[] args) {
		SpringApplication.run(BallerApplication.class, args);
	}
}
