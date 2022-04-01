package com.ibm.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	@Id
	@Column(name="bid")
	private int bid;
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Column(name="publisher")
	private String publisher;
	@Column(name="pages")
	private int pages;
	@Column(name="category")
	private String category;
	@Column(name="description")
	private String description;
	@Column(name="imageurl")
	private String imageurl;
	@Column(name="pdfurl")
	private String pdfurl;
	
	public Books(){}

	public Books(int bid, String title, String author, String publisher, int pages, String category, String description, String imageurl, String pdfurl) {
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
		this.category = category;
		this.description = description;
		this.imageurl = imageurl;
		this.pdfurl = pdfurl;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getPdfurl() {
		return pdfurl;
	}

	public void setPdfurl(String pdfurl) {
		this.pdfurl = pdfurl;
	}
	
	
	
}
