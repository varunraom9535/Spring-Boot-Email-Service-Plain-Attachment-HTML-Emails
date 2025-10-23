package com.varunraom.esp_System.services;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.varunraom.esp_System.model.Email;
import com.varunraom.esp_System.model.EmailRequest;
import com.varunraom.esp_System.repository.EmailRepository;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailSerrvicesImp implements EmailService{

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private EmailRepository emailRepo;
	
	
	public String sendEmail(EmailRequest request) {
		
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(request.getRecipient());
			message.setSubject(request.getSubject());
			message.setText(request.getMessage());
			mailSender.send(message);
			Email email = new Email(request.getRecipient(), request.getSubject(), request.getMessage());
			emailRepo.save(email);
			return "Email Sent Sucessfully";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Error" + e.getMessage();
			
		}
	}
	
	public String sendEmailAttachment(EmailRequest request) {
	    try {
	        if(request.getRecipient() == null || request.getRecipient().isEmpty()) {
	            return "Error: Recipient email is missing!";
	        }
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message, true);
	        helper.setFrom("varunraomvarunraom1@gmail.com");
	        helper.setTo(request.getRecipient());
	        helper.setSubject(request.getSubject());
	        helper.setText(request.getMessage()); // use 'true' for HTML if needed
	        File file = new File("C:\\varunraom (3).pdf");
	        if(file.exists()) {
	            helper.addAttachment("resume.pdf", file);
	        } else {
	            System.out.println("Attachment file not found!");
	        }
	        mailSender.send(message);

	        Email email = new Email(request.getRecipient(), request.getSubject(), request.getMessage());
	        emailRepo.save(email);

	        return "Email Sent Successfully with attachment";

	    } catch (Exception e) {
	        e.printStackTrace();
	        return "Error: " + e.getMessage();
	    }
	}

	@Override
	public String sendEmailAttachmentHtmlBody(EmailRequest request) {
		 try {
		        if(request.getRecipient() == null || request.getRecipient().isEmpty()) {
		            return "Error: Recipient email is missing!";
		        }
		        MimeMessage message = mailSender.createMimeMessage();
		        MimeMessageHelper helper = new MimeMessageHelper(message, true);
		        helper.setFrom("varunraomvarunraom1@gmail.com");
		        helper.setTo(request.getRecipient());
		        helper.setSubject(request.getSubject());
		        ClassPathResource resource = new ClassPathResource("templates/emai-content.html");
	            try (var inputStream = resource.getInputStream()) {
	                String html = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
	                // Optional: replace a placeholder in HTML with request message
	                html = html.replace("${message}", request.getMessage());
	                helper.setText(html, true);
	            }
		        mailSender.send(message);

		        Email email = new Email(request.getRecipient(), request.getSubject(), request.getMessage());
		        emailRepo.save(email);

		        return "Email Sent Successfully with html attachment";

		    } catch (Exception e) {
		        e.printStackTrace();
		        return "Error: " + e.getMessage();
		    }
	}
}