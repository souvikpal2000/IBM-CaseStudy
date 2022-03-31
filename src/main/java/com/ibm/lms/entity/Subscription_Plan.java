package com.ibm.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscription_plans")
public class Subscription_Plan {
	@Id
	@Column(name="planid")
	private int planid;
	@Column(name="duration")
	private int duration;
	@Column(name="price")
	private float price;
	@Column(name = "name")
	private String name;

	public Subscription_Plan() {}

	

	public Subscription_Plan(int planid, int duration, float price, String name) {
		super();
		this.planid = planid;
		this.duration = duration;
		this.price = price;
		this.name = name;
	}

	public int getPlanid() {
		return this.planid;
	}



	public void setPlanid(int planid) {
		this.planid = planid;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}	
}
