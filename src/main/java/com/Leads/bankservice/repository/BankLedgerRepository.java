package com.Leads.bankservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Leads.bankservice.model.BankLedger;

public interface BankLedgerRepository extends JpaRepository<BankLedger, Integer> { 

}
