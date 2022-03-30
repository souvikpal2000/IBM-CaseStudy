package com.ibm.lms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.lms.entity.Member_Subscription;
import com.ibm.lms.entity.Subscription_Plan;
import com.ibm.lms.repository.Member_Subscription_Repo;
import com.ibm.lms.repository.Subscription_Plan_Repo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.text.ParseException;
import java.util.Date;

@Service
public class Member_Subscription_Services {
	@Autowired
	Member_Subscription_Repo repo;
	
	@Autowired
	Subscription_Plan_Repo repo1;
	
	public void addMemberSubscription(Member_Subscription msub){
		Subscription_Plan subPlan = repo1.getById(msub.getSubPlan().getPlanid());
		int duration = subPlan.getDuration();
		LocalDate date = LocalDate.now();
		LocalDate lastDate = date.plusDays(duration);
	    msub.setDate(lastDate);
	    msub.setStatus("active");
//		LocalDate checkDate = repo.checkActive(msub.getMember().getUserid());
//		long numberOfDays = ChronoUnit.DAYS.between(date, checkDate);
//		if(numberOfDays > 0) {
//			msub.setStatus("inactive");
//		}
		repo.save(msub);
	}
	
	public void deleteMemberSubscriptionById(int id) {
		repo.deleteById(id);
	}
}
