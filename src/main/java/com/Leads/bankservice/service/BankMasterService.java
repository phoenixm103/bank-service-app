package com.Leads.bankservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leads.bankservice.common.Converter;
import com.Leads.bankservice.customerservice.CustomerLedger;
import com.Leads.bankservice.model.BankLedger;
import com.Leads.bankservice.model.BankMaster;
import com.Leads.bankservice.repository.BankMasterRepository;

@Service
public class BankMasterService {
	@Autowired
	private BankMasterRepository bankMasterRepository;
	
	@Autowired
	private RabbitMQSender rabbitMQSender;
	
	public List<BankMaster> getAllBankMaster() {
		// TODO Auto-generated method stub
		return bankMasterRepository.findAll();
	}

	

	public void addToBankMaster(BankMaster bankMaster) {
		bankMasterRepository.save(bankMaster);
		
	}

	public void addToBankMaster(BankLedger bankLedger,CustomerLedger customerLedger) {
		BankMaster bankMaster=getBankMaster(bankLedger.getBankId());
		bankMaster.setAmount(bankMaster.getAmount()+bankLedger.getAmount());
		bankMaster.setLastTransactionDate(bankLedger.getTransactionDate());
		addToBankMaster(bankMaster);
		rabbitMQSender.send(customerLedger);
		
	}
	public BankMaster getBankMaster(int accountId) {
		return Converter.getBankMasterById(bankMasterRepository.findAll(),accountId);
	}
	
	

}
