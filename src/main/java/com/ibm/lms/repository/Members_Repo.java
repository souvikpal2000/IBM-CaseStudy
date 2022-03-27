package com.ibm.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.lms.entity.Members;

public interface Members_Repo extends JpaRepository<Members, Integer> {
	
//	@Query("DELETE FROM members WHERE userid=:id")
//	void deleteMemberById(int id);
}
