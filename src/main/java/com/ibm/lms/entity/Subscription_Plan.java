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
	
	public Subscription_Plan() {}

	public Subscription_Plan(int planid, int duration, float price) {
		super();
		this.planid = planid;
		this.duration = duration;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Subscription_Plan [planid=" + planid + ", duration=" + duration + ", price=" + price + "]";
	}
	
	
}
