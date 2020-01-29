package com.Leads.bankservice.customerservice;
import java.util.Date;
import javax.persistence.Id;


public class CustomerLedger {

	private int transactionId;
	private int batchId;
	private int customerId;
	private String transactionType; // for ex- Deposit or Withdraw
	private Double amount;
	private Date transactionDate;
	
	public CustomerLedger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerLedger(int transactionId, int batchId, int customerId, String transactionType, Double amount,
			Date transactionDate) {
		super();
		this.transactionId = transactionId;
		this.batchId = batchId;
		this.customerId = customerId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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