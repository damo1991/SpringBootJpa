package com.peoplemanagement.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.peoplemanagement.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementQueryMethodDemoApplication implements CommandLineRunner {
	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementQueryMethodDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int id=2;
		String newEmail="damu@gmail.com";
		peopleManagementService.updatePersonEmailById(id,newEmail);

	}

}
