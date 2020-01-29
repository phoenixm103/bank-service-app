package com.Leads.bankservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leads.bankservice.common.Converter;
import com.Leads.bankservice.customerservice.CustomerLedger;
import com.Leads.bankservice.model.BankLedger;
import com.Leads.bankservice.repository.BankLedgerRepository;
import com.Leads.bankservice.repository.BankMasterRepository;




@Service
public class BankLedgerService {
	
	@Autowired
	private BankLedgerRepository bankLedgerRepository;
	
	@Autowired
	private BankMasterService bankMasterService;
	
	public List<BankLedger> getAllBankLedger() {
		return bankLedgerRepository.findAll();
	}


	public void addToBankLedger(BankLedger bankLedger) {
		bankLedgerRepository.save(bankLedger);
	}
	////this one comes from RMQ>RMQ Listener
	public void addToBankLedger(BankLedger bankLedger,CustomerLedger customerLedger) {
		bankLedgerRepository.save(bankLedger);
		bankMasterService.addToBankMaster(bankLedger,customerLedger); 
		
	}

	public BankLedger getBankLedger(int id) {
		
		return Converter.getBankLedgerById(bankLedgerRepository.findAll(),id);
	}

}
