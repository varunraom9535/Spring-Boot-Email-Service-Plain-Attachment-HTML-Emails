package com.varunraom.esp_System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.varunraom.esp_System.model.EmailRequest;
import com.varunraom.esp_System.services.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailServices;
	
	@GetMapping("/")
	public String main() {
		return "Spring Boot Email Sender project is Running Successfullt...!";
	}
	
	@PostMapping("sendEmail")
	public String sendEmail(@RequestBody EmailRequest request) {
		return emailServices.sendEmail(request);
	}
	
	
	@PostMapping("sendEmailWithAttachment")
	public String sendEmailAttachment(@RequestBody EmailRequest request) {
		return emailServices.sendEmailAttachment(request);
	}
	
	@PostMapping("sendEmailWithAttachmentHtml")
	public String sendEmailAttachmentHtmlBody(@RequestBody EmailRequest request) {
		return emailServices.sendEmailAttachmentHtmlBody(request);
	}
	
}
