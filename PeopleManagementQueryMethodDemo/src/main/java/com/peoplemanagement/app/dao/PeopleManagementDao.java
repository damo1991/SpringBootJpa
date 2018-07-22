package com.peoplemanagement.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.peoplemanagement.app.model.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer>{

	List<Person> findByLastName(String lastName);

	List<Person> findByFirstNameAndEmail(String firstName, String email);

}
