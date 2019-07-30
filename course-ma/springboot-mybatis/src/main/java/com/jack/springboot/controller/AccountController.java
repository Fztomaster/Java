package com.jack.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jack.springboot.model.Account;
import com.jack.springboot.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/list")
	public List<Account> findAll() {
		return accountService.findAll();
	}
	
	@RequestMapping("/add")
	public String add() {
		accountService.insert();
		return "ok";
	}
}
