package com.ibm.lms;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.lms.entity.Subscription_Plan;
import com.ibm.lms.services.Books_Services;
import com.ibm.lms.services.Member_Subscription_Services;
import com.ibm.lms.services.Members_Services;

public class HomeController {
	
	@Autowired
	Members_Services memberServe;
	
	@Autowired
	Books_Services bookServe;
	
	@Autowired
	Member_Subscription_Services memsubServe;
	
	@Autowired
	Subscription_Plan subsServe;
	
	
	
}
