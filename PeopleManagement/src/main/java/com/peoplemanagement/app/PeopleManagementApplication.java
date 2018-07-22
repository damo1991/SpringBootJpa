package com.peoplemanagement.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.peoplemanagement.app.model.Person;
import com.peoplemanagement.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementApplication implements CommandLineRunner {
	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// createPerson();
		// createPersons();
		//getPersonByIds();
		//deletePersonEntity();
		updatePersonEmailById();
		

	}

	private void updatePersonEmailById() {

		peopleManagementService.updatePersonEmailById(2,"damodhar7@yahoo.com");
		
	}

	private void deletePersonEntity() {
		Person person = new Person();
		person.setId(3);

		peopleManagementService.deletePersonEntity(person);

	}

	private void getPersonByIds() {
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		ids.add(20);
		List<Person> persons = peopleManagementService.getPersonByIds(ids);
		persons.forEach(System.out::println);

	}

	private void createPersons() {
		List<Person> persons = Arrays.asList(new Person("Pantala Damodhar", "Rao", "damodharr70@gmail.com", new Date()),
				new Person("Venkat", "Rao", "damodhar440@gmail.com", new Date()),
				new Person("Teja", "Pantala", "damodhar407@gmail.com", new Date()));
		List<Person> persons1 = peopleManagementService.createPersons(persons);
		persons1.forEach(System.out::println);
	}

	private void createPerson() {
//String firstName, String lastName, String email, Date creationDate
		Person person = new Person("Damodhar", "Rao", "damodharr7@gmail.com", new Date());
		Person person1 = peopleManagementService.createPerson(person);

		System.out.println("people saved!!" + person1);
	}
}
