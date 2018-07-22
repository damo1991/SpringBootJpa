package com.peoplemanagement.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.peoplemanagement.app.dao.PeopleManagementDao;
import com.peoplemanagement.app.model.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<Person> findByLastName(String lastName,Pageable pageable) {
		
		return peopleManagementDao.findByLastName(lastName, pageable);
	}

}
