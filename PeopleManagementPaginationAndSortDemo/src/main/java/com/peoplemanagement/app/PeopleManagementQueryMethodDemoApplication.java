package com.peoplemanagement.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

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

		List<Person> list=peopleManagementService.findByLastName("Rao",PageRequest.of(0, 2, Direction.ASC, "firstName"));
		list.forEach(System.out::println);
	}

}
