package com.ibm.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.lms.entity.Members;
import com.ibm.lms.repository.Members_Repo;

@Service
public class Members_Services {
	
	@Autowired
	Members_Repo repo;
	
	public void addMember(Members m) {
		repo.save(m);
	}
	public void deleteMemberById(int id) {
		repo.deleteById(id);
	}
	public List<Members> checkMail(String emailid) {
		List<Members> list = repo.check(emailid);
		return list;
	}
}
