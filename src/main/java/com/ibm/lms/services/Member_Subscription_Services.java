package com.ibm.lms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.lms.entity.Member_Subscription;
import com.ibm.lms.entity.Subscription_Plan;
import com.ibm.lms.repository.Member_Subscription_Repo;
import com.ibm.lms.repository.Subscription_Plan_Repo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
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
		repo.save(msub);
	}
	
	public void deleteMemberSubscriptionById(int id) {
		repo.deleteById(id);
	}
	
	@Transactional
	public void checkActiveOrNot(String userid) {
		LocalDate date = repo.checkActive(userid);
		LocalDate curDate = LocalDate.now();
		//long numberOfDays = ChronoUnit.DAYS.between(curDate, date);
		Period period = Period.between(curDate, date);
		if(period.getDays() < 0) {
			//inactive
			String status = "inactive";
			repo.updateStatus(userid, status);
		}
	}
}
