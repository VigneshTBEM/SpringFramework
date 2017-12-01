package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.BankAccount;

@Repository("BankAccountDao")
public class BankAccountDaoImpl extends AbstractDao<Integer, BankAccount> implements BankAccountDao  {
	

	public BankAccount findById(int id) {
		return getByKey(id);
	}

	public void saveBankAcc(BankAccount bankacc) {
		persist(bankacc);
	}

	public void deleteBankAccById(int id) {
		
		Query query = getSession().createSQLQuery("delete from BankAccount where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<BankAccount> GetAllBankAccs() {
		Criteria criteria = createEntityCriteria();
		return (List<BankAccount>) criteria.list();
	}

}
