package com.Leads.bankservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankMaster {
	@Id
	private int id;
	private int accountId;
	private Double amount;
	private Date lastTransactionDate;
	
	public BankMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankMaster(int id, int accountId, Double amount, Date lastTransactionDate) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.amount = amount;
		this.lastTransactionDate = lastTransactionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}

	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}
	
	
	
	
}