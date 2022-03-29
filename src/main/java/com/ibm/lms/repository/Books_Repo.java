package com.ibm.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ibm.lms.entity.Books;

public interface Books_Repo extends JpaRepository<Books, Integer>{
//	@Query("Select * from Books")
//	//List<Books> findAllBooks();
//	
//	/*@Query("INSERT INTO books VALUES(:bid, :title, :author, :publisher, :pages, :category)")
//	void insertBook(@Param("bid") int bid, 
//					@Param("title") String title, 
//					@Param("author") String author,
//					@Param("publisher") String publisher,
//					@Param("pages") int pages,
//					@Param("category") String category);*/
//	
//	@Query("DELETE FROM books WHERE bid=:bid")
//	void deleteBookById(@Param("bid") int bid);
	
	@Query(nativeQuery=true, value="SELECT * FROM books WHERE title=:name")
	List<Books> check(String name);
}
