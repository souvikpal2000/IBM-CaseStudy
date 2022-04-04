package com.ibm.lms.controller;

import java.io.File;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ibm.lms.entity.Books;
import com.ibm.lms.services.Books_Services;
@CrossOrigin
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
	
	@PostMapping("/upload")
	public ResponseEntity<?> fileUpload(@RequestParam("file1") MultipartFile file1,@RequestParam("file2") MultipartFile file2){
		String fileName1 = file1.getOriginalFilename();
		String fileName2 = file2.getOriginalFilename();
		try {
			file1.transferTo( new File("C:\\Users\\sumit\\Documents\\Ibm_final\\Frontend\\IBM-CaseStudy\\src\\assets\\books\\" + fileName1));
			file2.transferTo( new File("C:\\Users\\sumit\\Documents\\Ibm_final\\Frontend\\IBM-CaseStudy\\src\\assets\\books\\" + fileName2));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok("File upload successfully");	
	}
	
	@GetMapping(value = "/getbooks")
	public List<Books> getBooks() {
		return bookServe.viewAllBooks();
	}
	
	@GetMapping("/getBooks/{aid}")
	public Optional<Books> getBooksById(@PathVariable("aid") int aid) {
		return bookServe.viewBookById(aid);
	}
}