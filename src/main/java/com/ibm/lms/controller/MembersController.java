package com.ibm.lms.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.lms.entity.Member_Subscription;
import com.ibm.lms.entity.Members;
import com.ibm.lms.services.Member_Subscription_Services;
import com.ibm.lms.services.Members_Services;
@CrossOrigin
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
			return "User Added Successfully";
		}else {
			return "This Email is Already Registered!!!";
		}
	}
	
	@PostMapping("/login")
	public String authMember(@Param("username") String username, @Param("password") String password) {
		List<Members> list = memberServe.checkMail(username);
		if(list.size() != 0) {	
			int flag = memberServe.checkPassword(username, password);
			if(flag == 1) {
				String status = memberSubServ.checkActiveOrNot(username);
				return status;
			}else {
				return "Incorrect Password";
			}
		}else {
			return "You're not Registered";
		}
	}
	
	@PostMapping("/getrole")
	public String getMemberRole(@Param("username") String username) {
		return memberServe.getMember(username).get(0).getUser_role();
	}

}
