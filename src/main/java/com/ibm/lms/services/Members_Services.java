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
	
	public int addMember(Members m) {
		List<Members> list = this.checkMail(m.getEmailid());
		if(list.size() != 0) {
			return 0;
		}
		else {
			m.setUserid(m.getEmailid());
			m.setUser_role("user");
			repo.save(m);
			return 1;
		}
	}
	
	public void deleteMemberById(int id) {
		repo.deleteById(id);
	}
	
	public List<Members> checkMail(String emailid) {
		List<Members> list = repo.check(emailid);
		return list;
	}
	
	public int checkPassword(String username, String password) {
		
		List<Members> list = repo.checkPasswordForUsername(username, password);
		if(list.size() != 0) {
			return 1;
		}else {
			return 0;
		}
	} 
	
	public List<Members> getMember(String username) {
		List<Members> list = repo.getMemberByUsername(username);
		return list;
	}
	
}
