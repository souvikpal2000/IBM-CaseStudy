package com.ibm.lms;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.lms.entity.Books;
import com.ibm.lms.entity.Members;
import com.ibm.lms.entity.Subscription_Plan;
import com.ibm.lms.services.Books_Services;
import com.ibm.lms.services.Members_Services;

@RestController
public class HomeController {
	
	@Autowired
	Members_Services memberServe;
	
	@Autowired
	Books_Services bookServe;
//	
//	@Autowired
//	Member_Subscription_Services memsubServe;
	
//	@Autowired
//	Subscription_Plan_Services subPlanServe;
	
	
//	@RequestMapping(value = "/addBook", method = RequestMethod.POST, produces = "application/json")
//	 public void addBook(@RequestBody Books book) {
//	 bookServe.addBooks(book);
//	}
//	
//	@RequestMapping(value = "/getBooks", method = RequestMethod.GET, produces = "application/json")
//	public List<Books> getBooks() {
//		return bookServe.viewAllBooks();
//	}
	
	@PostMapping("/signup")
	public String addMembers(@RequestBody Members m) {
		List<Members> list = memberServe.checkMail(m.getEmailid());
		if(list.size() == 0) {
			memberServe.addMember(m);
			return "User Added Successfully!!!";
		}
		else {
			return "Email Already Existed!!!";
		}
	}
	
	@PostMapping("/addBook")
	 public String addBook(@RequestBody Books book) {
	 List<Books> list = bookServe.checkBook(book);
	 if(list.size() == 0) {
		 bookServe.addBooks(book);
		 return "Book Added Successfully!!!";
	 } 
	 else {
		 return "Book Already Existed!!!";
	 }
	 
	}
	
	@GetMapping("/getBooks/{aid}")
	public Optional<Books> getBooksById(@PathVariable("aid") int aid) {
		return bookServe.viewBookById(aid);
	}
	
	@GetMapping("/getBooks")
	public List<Books> getBooks(){
		return bookServe.viewAllBooks();
	}
}
