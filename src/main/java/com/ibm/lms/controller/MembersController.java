package com.ibm.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.lms.entity.Members;
import com.ibm.lms.services.Member_Subscription_Services;
import com.ibm.lms.services.Members_Services;
@RestController
public class MembersController {
	
	@Autowired
	Members_Services memberServe;
	@Autowired
	Member_Subscription_Services memberSubServ;
	
	@PostMapping("/signup")
	public String addMembers(@RequestBody Members m) {
		List<Members> list = memberServe.checkMail(m.getEmailid());
		if(list.size() == 0) {
			memberServe.addMember(m);
			//memberSubServ.addMemberSubscription(m);
			return "User Added Successfully!!!";
		}
		else {
			return "Email Already Existed!!!";
		}
	}
}
