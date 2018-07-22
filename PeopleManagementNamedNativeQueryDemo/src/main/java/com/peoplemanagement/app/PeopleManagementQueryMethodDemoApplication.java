package com.peoplemanagement.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.peoplemanagement.app.model.Person;
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

		//getPersonInfoByLastName();
		getPersonInfoByFirstNameAndEmail();
	}

	private void getPersonInfoByFirstNameAndEmail() {
		List<Person> personList=peopleManagementService.getPersonInfoByFirstNameAndEmail("Damodhar","damodharr7@gmail.com");
		personList.forEach(System.out::println);
		
	}

	private void getPersonInfoByLastName() {
		List<Person> personList=peopleManagementService.getPersonInfoByLastName("Rao");
		personList.forEach(System.out::println);
		
	}
}
