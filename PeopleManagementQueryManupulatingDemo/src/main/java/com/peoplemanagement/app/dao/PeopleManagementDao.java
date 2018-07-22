package com.peoplemanagement.app.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.peoplemanagement.app.model.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer>{

	@Transactional
	@Modifying
	@Query(value="UPDATE Person set email=:newEmail where id=:personId")
	void updatePersonEmailById(@Param("personId") int id,@Param("newEmail") String newEmail);

}
