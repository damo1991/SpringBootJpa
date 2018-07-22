package com.peoplemanagement.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.peoplemanagement.app.model.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer>{

	@Query(value="SELECT p FROM Person p WHERE p.lastName=:lastName")
	List<Person> getPersonByLastName(@Param("lastName") String lastName);

	@Query(value="SELECT p FROM Person p WHERE p.firstName=:firstName AND email=:email")
	List<Person> gotPersonInfoByFirstNameAndEmail(@Param("firstName")String firstName, @Param("email")String email);

}
