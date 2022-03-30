package com.ibm.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="members")
public class Members {
	@Id
	@Column(name="userid")
	private String userid;
	@Column(name="password")
	private String password;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="emailid")
	private String emailid;
	@Column(name="mobile")
	private long mobile;
	@Column(name="user_role")
	private String user_role;

	public Members() {}

	public Members(String userid, String password, String firstname, String lastname, String emailid, long mobile,
			String user_role) {
		super();
		this.userid = userid;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.mobile = mobile;
		this.user_role = user_role;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}	
}
