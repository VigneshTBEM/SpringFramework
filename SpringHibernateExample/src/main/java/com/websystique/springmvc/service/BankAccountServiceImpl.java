package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.BankAccountDao;
import com.websystique.springmvc.model.BankAccount;

@Service("BankAccountService")
@Transactional
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountDao bankAccountDao;
	
	public BankAccount findById(int id) {
		return bankAccountDao.findById(id);
	}

	public void saveBankAcc(BankAccount bankacc) {
		bankAccountDao.saveBankAcc(bankacc);
	}

	public void deleteBankAccById(int id) {
		bankAccountDao.deleteBankAccById(id);
	}

	public List<BankAccount> GetAllBankAccs() {
		return bankAccountDao.GetAllBankAccs();
	}

}
