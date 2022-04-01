package com.ibm.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.lms.entity.Subscription_Plan;
import com.ibm.lms.services.Subscription_Plan_Services;

@CrossOrigin
@RestController
public class SubscriptionPlanController {
	
	@Autowired
	Subscription_Plan_Services subPlanServe;
	
	@GetMapping("/getplans")
	public List<Subscription_Plan> getPlans() {
		return subPlanServe.getAllPlans();
	}
}
