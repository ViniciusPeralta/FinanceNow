package com.peralta.financenow.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_accounts")
public class Account{
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(nullable=false)
	private Double balance;
	
	@Column(nullable=false)
	private String type;
	
	@Column(nullable=false)
	private String bank;
	
	@ManyToOne
	private User user;
	
	@OneToMany(mappedBy="account")
	private List<Transaction> transactions = new ArrayList<>();
	
	public Account() {
	}
	
	public Account(Double balance, String type, String bank, User user) {
		this.balance = balance;
		this.type = type;
		this.bank = bank;
		this.user = user;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public Long getId() {
		return Id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
