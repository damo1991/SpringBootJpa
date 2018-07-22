package com.peoplemanagement.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.peoplemanagement.app.model.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer>{

}
