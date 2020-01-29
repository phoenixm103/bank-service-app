package com.Leads.bankservice.common;

import java.util.List;

import com.Leads.bankservice.model.BankLedger;
import com.Leads.bankservice.model.BankMaster;


public class Converter {
	
	public static BankLedger getBankLedgerById(List<BankLedger> bl, int id) {
		
		for(int i=0;i<bl.size();i++) {
			BankLedger bankLedger=bl.get(i);
			if(bankLedger.getTransactionId()==id) {
			return bankLedger;	
			}
		}
		return null;
	}

	public static BankMaster getBankMasterById(List<BankMaster> findAll, int accountId) {
		for(int i=0;i<findAll.size();i++) {
			BankMaster bankMaster=findAll.get(i);
			if(bankMaster.getAccountId()==accountId) {
			return bankMaster;	
			}
			}
		return null;
	}
}
