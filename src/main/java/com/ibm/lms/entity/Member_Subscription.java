package com.ibm.lms.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="member_subscription")
public class Member_Subscription {
	@Id
	@Column(name="subscription_id")
	private int subscription_id;

	@OneToOne
	@JoinColumn(name="userid")
	Members member;

	@OneToOne
	@JoinColumn(name="planid")
	Subscription_Plan subPlan;


	@Column(name="date")
	private LocalDate date;
	@Column(name="status")
	private String status;
	
	public Member_Subscription() {}

	public Member_Subscription(int subscription_id, Members member, Subscription_Plan subPlan, LocalDate date, String status) {
		super();
		this.subscription_id = subscription_id;
		this.member = member;
		this.subPlan = subPlan;
		this.date = date;
		this.status = status;
	}

	public int getSubscription_id() {
		return subscription_id;
	}

	public void setSubscription_id(int subscription_id) {
		this.subscription_id = subscription_id;
	}

	

	public Members getMember() {
		return member;
	}

	public void setMember(Members member) {
		this.member = member;
	}

	public Subscription_Plan getSubPlan() {
		return this.subPlan;
	}

	public void setSunPlan(Subscription_Plan subPlan) {
		this.subPlan = subPlan;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate lastDate) {
		this.date = lastDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
