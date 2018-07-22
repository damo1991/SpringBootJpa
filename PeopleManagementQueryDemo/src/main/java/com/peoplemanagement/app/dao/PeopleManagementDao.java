package com.peoplemanagement.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.peoplemanagement.app.model.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer>{

	@Query(value="SELECT p FROM Person p WHERE p.lastName=?1")
	List<Person> getPersonByLastName(String lastName);

	@Query(value="SELECT p FROM Person p WHERE p.firstName=?1 AND email=?2")
	List<Person> gotPersonInfoByFirstNameAndEmail(String firstName, String email);

}
