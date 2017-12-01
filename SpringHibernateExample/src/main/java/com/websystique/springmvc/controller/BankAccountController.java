package com.websystique.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.websystique.springmvc.service.BankAccountService;

@Controller
public class BankAccountController {

	@Autowired
	private BankAccountService service;
	
}
