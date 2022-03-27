package com.ibm.lms.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.lms.entity.Member_Subscription;
import com.ibm.lms.repository.Member_Subscription_Repo;

public class Member_Subscription_Services {
	@Autowired
	Member_Subscription_Repo repo;
	
	void addMemberSubscription(Member_Subscription msub){
		repo.save(msub);
	}
	
	void deleteMemberSubscriptionById(int id) {
		repo.deleteById(id);
	}
}
