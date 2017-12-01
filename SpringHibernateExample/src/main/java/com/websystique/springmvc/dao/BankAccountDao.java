package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.BankAccount;

public interface BankAccountDao {

	BankAccount findById(int id);

	void saveBankAcc(BankAccount bankacc);
	
	void deleteBankAccById(int id);
	
	List<BankAccount> GetAllBankAccs();
}
