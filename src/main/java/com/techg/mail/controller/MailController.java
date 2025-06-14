package com.techg.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techg.mail.content.ContentLibrary;
import com.techg.mail.service.EmailService;

@RestController
@RequestMapping(value = {"/","/techg.com","/api/send/email"})
public class MailController {
	
	@Autowired
	private EmailService service;
	
	@Autowired
	private ContentLibrary contentLibrary;
	
	@RequestMapping
	public String live() {
		return contentLibrary.getLandingPage();
	}
	
	@RequestMapping("/hi")
	public String hi() {
		return "<html><body style='display:flex; flex-direction:column; justify-content:center; align-items:center; background:#7F00FF; color:white; font-size:3vw;'> <h1>Hello</h1>  <h1>From</h1>  <h1>Spring Boot Application</h1></body></html>";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "<html><body style='display:flex; flex-direction:column; justify-content:center; align-items:center; background:#7F00FF; color:white; font-size:3vw;'> <h1>Hi</h1>  <h1>From</h1>  <h1>Spring Boot Application</h1></body></html>";
	}
	
	
	@RequestMapping("/reg")
	public String regForm() {
		return contentLibrary.getRegistrationPage();
	}
	
	
	@RequestMapping("/email")
	public String sendEmail(@RequestParam String email,@RequestParam String name) {
		service.sendEmail(email,name);
		return contentLibrary.getMailSentPage();
	}
	
	
	
	
}
