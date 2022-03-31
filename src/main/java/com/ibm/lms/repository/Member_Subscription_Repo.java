package com.ibm.lms.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ibm.lms.entity.Member_Subscription;

public interface Member_Subscription_Repo extends JpaRepository<Member_Subscription, Integer>{
	@Query(nativeQuery=true, value="SELECT date FROM member_subscription WHERE userid=:userid")
	public LocalDate checkActive(String userid);
	
	@Modifying
	@Query(nativeQuery = true, value="UPDATE member_subscription SET status=:status WHERE userid=:userid")
	public void updateStatus(String userid, String status);
}
