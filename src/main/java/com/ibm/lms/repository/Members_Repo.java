package com.ibm.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.lms.entity.Members;

public interface Members_Repo extends JpaRepository<Members, Integer> {
	
	@Query(nativeQuery = true, value="SELECT * FROM members WHERE emailid=:emailid")
	List<Members> check(String emailid);
}
