package com.ibm.lms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member_subscription")
public class Member_Subscription {
	@Id
	@Column(name="subscription_id")
	private int subscription_id;
	@Column(name="userid")
	private int userid;
	@Column(name="planid")
	private int planid;
	@Column(name="date")
	private Date date;
	@Column(name="status")
	private String status;
	
	public Member_Subscription() {}

	public Member_Subscription(int subscription_id, int userid, int planid, Date date, String status) {
		super();
		this.subscription_id = subscription_id;
		this.userid = userid;
		this.planid = planid;
		this.date = date;
		this.status = status;
	}

	public int getSubscription_id() {
		return subscription_id;
	}

	public void setSubscription_id(int subscription_id) {
		this.subscription_id = subscription_id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getPlanid() {
		return planid;
	}

	public void setPlanid(int planid) {
		this.planid = planid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Member_Subscription [subscription_id=" + subscription_id + ", userid=" + userid + ", planid=" + planid
				+ ", date=" + date + ", status=" + status + "]";
	}
	
	
}
