package com.Leads.bankservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Leads.bankservice.model.BankMaster;

public interface BankMasterRepository extends JpaRepository<BankMaster, Integer> {

}
