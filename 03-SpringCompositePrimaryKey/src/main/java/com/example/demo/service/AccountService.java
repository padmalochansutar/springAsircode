package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;

import com.example.demo.repository.AccountRepository;



@Service
public class AccountService {
	
	private AccountRepository accountRepository;
	
	public AccountService( AccountRepository accountRepository) {
		this.accountRepository=accountRepository;
	}
	public void saveData() {
		
//		AccountPK ac=new AccountPK();
//		ac.setAccId(101);
//		ac.setAccType("current");
//		ac.setAccHolderName("IBM");
//		
		Account account=new Account();
		account.setBranchName("HDFC");
		account.setMinBal(50000.00);
		//account.setAccountPK(ac);
		account.setAccId(102);
		account.setAccType("Saving");
		account.setAccHolderName("IBM");
		accountRepository.save(account);
	}

}
