package com.peoplemanagement.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peoplemanagement.app.dao.PeopleManagementDao;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public void updatePersonEmailById(int id, String newEmail) {
		peopleManagementDao.updatePersonEmailById(id,newEmail);
	}

}
