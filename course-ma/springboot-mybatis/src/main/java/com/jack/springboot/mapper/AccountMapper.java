package com.jack.springboot.mapper;

import java.util.List;

import com.jack.springboot.model.Account;

public interface AccountMapper {

	List<Account> findAll();
	
	void insert(Account account);
}
