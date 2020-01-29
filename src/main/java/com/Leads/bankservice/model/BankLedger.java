package com.Leads.bankservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankLedger {
	@Id
	private int transactionId;
	private int batchId;
	private int bankId;
	private String transactionType; // for ex- Deposit or Withdraw
	private Double amount;
	private Date transactionDate;
	
	public BankLedger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankLedger(int transactionId, int batchId, int bankId, String transactionType, Double amount,
			Date transactionDate) {
		super();
		this.transactionId = transactionId;
		this.batchId = batchId;
		this.bankId = bankId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
	
}
