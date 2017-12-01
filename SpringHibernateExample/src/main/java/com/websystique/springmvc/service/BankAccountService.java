package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.BankAccount;

public interface BankAccountService {

	BankAccount findById(int id);

	void saveBankAcc(BankAccount bankacc);
	
	void deleteBankAccById(int id);
	
	List<BankAccount> GetAllBankAccs();
}
