package com.developerstalk.app;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.developerstalk.service.MoneyManagerService;

@SpringBootApplication
@ComponentScan("com.developerstalk.service")
public class MoneyManagerApplication {
	
	@Autowired
	private MoneyManagerService moneyManagerService;
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(MoneyManagerApplication.class, args);
		System.out.println("============================================== ");
		System.out.println("||       Welcome to the Money Manager App    ||");
		System.out.println("============================================== ");
	}

}
