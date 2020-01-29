package com.Leads.bankservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Leads.bankservice.model.BankMaster;
import com.Leads.bankservice.service.BankMasterService;


@RestController
public class BankMasterController {
	@Autowired
	private BankMasterService bankMasterService;
	
	@RequestMapping(method=RequestMethod.GET, value = "/bankMasters")
	public List<BankMaster> getAllBankMaster(){
		return bankMasterService.getAllBankMaster();
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/bankMasters/{id}")
	public BankMaster getBankMaster(@PathVariable int id) {
		return bankMasterService.getBankMaster(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/bankMasters")
	public void addToBankMaster(@RequestBody BankMaster bankMaster) {
		bankMasterService.addToBankMaster(bankMaster);
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
