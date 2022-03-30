package com.ibm.lms.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;


import com.ibm.lms.services.Member_Subscription_Services;
@RestController
public class MemberSubscriptionController {
	
	@Autowired
	Member_Subscription_Services memberSubSer;
	
	

}
