package com.ibm.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.lms.entity.Books;
import com.ibm.lms.services.Books_Services;
@RestController
public class BooksController {

	@Autowired
	Books_Services bookServe;
	
	@PostMapping(value = "/addBook")
	 public String addBook(@RequestBody Books book) {
	 List<Books> list = bookServe.checkBook(book);
	 if(list.size() == 0) {
		 bookServe.addBooks(book);
		 return "Book Added Successfully!!!";
	 } else {
		 return "Book Already Existed!!!";
	 }
	 
	}
	
	@GetMapping(value = "/getBooks")
	public List<Books> getBooks() {
		return bookServe.viewAllBooks();
	}
	
	@GetMapping("/getBooks/{aid}")
	public Optional<Books> getBooksById(@PathVariable("aid") int aid) {
		return bookServe.viewBookById(aid);
	}
}
