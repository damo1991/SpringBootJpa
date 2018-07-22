package com.peoplemanagement.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.peoplemanagement.app.dao.PeopleManagementDao;
import com.peoplemanagement.app.model.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<Person> getPersonInfoByLastName(String lastName) {
		return peopleManagementDao.getPersonByLastName(lastName);
	}

	public List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email) {
		return peopleManagementDao.gotPersonInfoByFirstNameAndEmail(firstName,email);
	}

}
