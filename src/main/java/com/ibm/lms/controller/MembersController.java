package com.ibm.lms.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.lms.entity.Member_Subscription;
import com.ibm.lms.services.Member_Subscription_Services;
import com.ibm.lms.services.Members_Services;
@RestController
public class MembersController {
	
	@Autowired
	Members_Services memberServe;
	@Autowired
	Member_Subscription_Services memberSubServ;
	
	@PostMapping("/signup")
	public String addMembers(@RequestBody Member_Subscription m) {
		int flag = memberServe.addMember(m.getMember());
		if(flag == 1) {
//			m.getMember().setUserid(m.getMember().getEmailid());
			memberSubServ.addMemberSubscription(m);
			return "Email Added Successfully";
		}else {
			return "Email is Already Registered!!!";
		}
		
	}
}
