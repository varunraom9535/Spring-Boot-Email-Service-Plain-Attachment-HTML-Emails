package com.varunraom.esp_System.services;

import org.springframework.stereotype.Service;

import com.varunraom.esp_System.model.EmailRequest;

@Service
public interface EmailService {

	public String sendEmail(EmailRequest request);

	public String sendEmailAttachment(EmailRequest request);
	
	public String sendEmailAttachmentHtmlBody(EmailRequest request);
	
}
