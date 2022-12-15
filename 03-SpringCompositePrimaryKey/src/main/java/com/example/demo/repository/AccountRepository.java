package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
