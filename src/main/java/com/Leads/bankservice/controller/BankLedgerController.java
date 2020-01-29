package com.Leads.bankservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Leads.bankservice.model.BankLedger;
import com.Leads.bankservice.service.BankLedgerService;

@RestController
public class BankLedgerController {
	@Autowired
	private BankLedgerService bankLedgerService;
	
	@RequestMapping(method=RequestMethod.GET, value = "/bankLedgers")
	public List<BankLedger> getAllBankLedger(){
		return bankLedgerService.getAllBankLedger();
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/bankLedgers/{id}")
	public BankLedger getBankLedger(@PathVariable int id) {
		return bankLedgerService.getBankLedger(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/bankLedgers")
	public void addToBankLedger(@RequestBody BankLedger bankLedger) {
		bankLedgerService.addToBankLedger(bankLedger);
	}
	
	/*@RequestMapping(method=RequestMethod.PUT, value = "/bankLedgers/{id}")
	public void updateBankLedger(@PathVariable Long id, @RequestBody BankLedger bankLedger) {
		bankLedgerService.updateBankLedger(id, bankLedger);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/bankLedgers/{id}")
	public void deleteFromBankLedger(@PathVariable Long id) {
		bankLedgerService.deleteFromBankLedger(id);
	}*/

}
