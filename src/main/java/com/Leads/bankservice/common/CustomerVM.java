package com.Leads.bankservice.common;

public class CustomerVM {
 private int customerId;
 private double amount;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public CustomerVM(int customerId, double amount) {
	super();
	this.customerId = customerId;
	this.amount = amount;
}
 
}
