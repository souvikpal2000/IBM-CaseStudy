package com.ibm.lms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.lms.entity.Subscription_Plan;
import com.ibm.lms.repository.Subscription_Plan_Repo;
@Service
public class Subscription_Plan_Services {
	
	@Autowired
	Subscription_Plan_Repo repo;
	
	void addSubscription(Subscription_Plan subplan) {
		repo.save(subplan);
	}
	
	void deleteSubscriptionById(int id) {
		repo.deleteById(id);
	}
	
//	void updateSubscriptionById(int id) {
//		repo.updateById(id);
//	}
}
