package com.form.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="form_data")
@GenericGenerator(name="idgen", strategy = "increment")
public class FormEntity {
	@Id
	@GeneratedValue(generator="idgen")
	private int id;
	@Column(name="customer_name")
	private String customerName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
