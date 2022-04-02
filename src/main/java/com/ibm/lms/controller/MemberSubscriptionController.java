package com.ibm.lms.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.lms.entity.Member_Subscription;
import com.ibm.lms.services.Member_Subscription_Services;
@CrossOrigin
@RestController
public class MemberSubscriptionController {
	
	@Autowired
	Member_Subscription_Services memberSubSer;
	
	@GetMapping("/checkstatus/{username}/{planid}")
	public void checkStatus(@PathVariable("username") String username, @PathVariable("planid") String planid) {
		memberSubSer.updateStatus(username, Integer.parseInt(planid));
	}
	
}
