package com.ibm.lms.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.lms.entity.Members;
import com.ibm.lms.repository.Members_Repo;

public class Members_Services {
	
	@Autowired
	Members_Repo repo;
	
	public void addMember(Members m) {
		repo.save(m);
	}
	
	public void deleteMemberById(int id) {
		repo.deleteById(id);
	}
}
