package com.jack.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jack.springboot.mapper.AccountMapper;
import com.jack.springboot.model.Account;

@Service
public class AccountService {

	@Autowired
	private AccountMapper accountMapper;
	
	public List<Account> findAll() {
		return accountMapper.findAll();
	}
	
	public void insert() {
		Account account = new Account();
		account.setLoginName("tom");
		account.setLocation("深圳");
		account.setNickName("tom");
		account.setPassword("123");
		account.setAge(18);
		accountMapper.insert(account);
	}
}
