package com.ibm.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.lms.entity.Subscription_Plan;

public interface Subscription_Plan_Repo extends JpaRepository<Subscription_Plan, Integer>{
	
	@Query("UPDATE ")
	void updateById(int id);
}
