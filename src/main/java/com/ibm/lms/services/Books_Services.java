package com.ibm.lms.services;

import java.util.List;
import java.util.Optional;

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
	
	public List<Books> checkBook(Books b){
		String name = b.getTitle();
		List<Books> list = repo.check(name);
		return list;
	}
	public Optional<Books> viewBookById(int aid) {
		Optional<Books> b = repo.findById(aid);
		return b;
	}
}
