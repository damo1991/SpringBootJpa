package com.peoplemanagement.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.peoplemanagement.app.model.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer>{

	@Query(value="SELECT * FROM person_table  WHERE last_name=?1",nativeQuery=true)
	List<Person> getPersonByLastName(String lastName);

	@Query(value="SELECT * FROM person_table  WHERE first_name=?1 AND email=?2",nativeQuery=true)
	List<Person> gotPersonInfoByFirstNameAndEmail(String firstName, String email);

}
