package com.ibm.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.lms.entity.Books;
import com.ibm.lms.repository.Books_Repo;

@Service
public class Books_Services {
	@Autowired
	Books_Repo repo;
	
	public void addBooks(Books b) {
		repo.save(b);
	}
	public void deleteBookById(int bid) {
		repo.deleteById(bid);
	}
	public List<Books> viewAllBooks(){
		return repo.findAll();
	}
}
