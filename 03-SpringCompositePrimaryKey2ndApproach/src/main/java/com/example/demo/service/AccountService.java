package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountPK;
import com.example.demo.repository.AccountRepository;



@Service
public class AccountService {
	
	private AccountRepository accountRepository;
	
	public AccountService( AccountRepository accountRepository) {
		this.accountRepository=accountRepository;
	}
	public void getData() {
		//data retrive from composite primary key;;;;
		AccountPK ac=new AccountPK();
		ac.setAccId(103);
		ac.setAccType("current");
		ac.setAccHolderName("CSM");
//		Optional<Account> findById = accountRepository.findById(ac);
//		if(findById.isPresent()) {
//			System.out.println(findById.get());
//		}
		
	}
	public void saveData() {
		
		AccountPK ac=new AccountPK();
		ac.setAccId(103);
		ac.setAccType("current");
		ac.setAccHolderName("CSM");
		
		Account account=new Account();
		account.setBranchName("STATE");
		account.setMinBal(50000.00);
		account.setAccountPK(ac);//setting pk class object to entity class object
		
		accountRepository.save(account);
	}

}
