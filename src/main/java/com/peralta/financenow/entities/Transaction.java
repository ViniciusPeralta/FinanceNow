package com.peralta.financenow.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_transactions")
public class Transaction {
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable=false)
	private Date date;
	
	@Column(nullable=false)
	private String classification;
	
	@Column(nullable=false)
	private String description;
	
	@Column(nullable=false)
	private Double value;
	
	@Column(nullable=false)
	private Double updated_balance;
	
	@ManyToOne
	private Account account;
	
	public Transaction() {
	}

	public Transaction(Date date, String classification, String description, Double value, Account account, Double updated_balance) {
		this.date = date;
		this.classification = classification;
		this.description = description;
		this.value = value;
		this.account = account;
		this.updated_balance = updated_balance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Double getUpdated_balance() {
		return updated_balance;
	}

	public void setUpdated_balance(Double updated_balance) {
		this.updated_balance = updated_balance;
	}

	public Long getId() {
		return id;
	}
}
