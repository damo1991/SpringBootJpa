package com.peoplemanagement.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peoplemanagement.app.dao.PeopleManagementDao;
import com.peoplemanagement.app.model.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public Person createPerson(Person person) {
		return peopleManagementDao.save(person);
	}

	public List<Person> createPersons(List<Person> persons) {
		return (List<Person>) peopleManagementDao.saveAll(persons);
	}

	public List<Person> getPersonByIds(List<Integer> ids) {
		return (List<Person>)peopleManagementDao.findAllById(ids);
	}

	public void deletePersonEntity(Person person) {

		peopleManagementDao.delete(person);
	}

	public void updatePersonEmailById(int id, String email) {
		
		Optional<Person> persons=peopleManagementDao.findById(id);
		
		persons.ifPresent(person->{person.setEmail(email);
		peopleManagementDao.save(person);
		});
		
	}

}
