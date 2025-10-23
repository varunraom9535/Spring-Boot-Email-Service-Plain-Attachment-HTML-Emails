package com.varunraom.esp_System.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "email_Details")
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String recipient;
	@Column(nullable = false)
	private String subject;
	@Column(nullable = false)
	private String message;
	
	
	public Email(int id, String recipient, String subject, String message) {
		super();
		this.id = id;
		this.recipient = recipient;
		this.subject = subject;
		this.message = message;
	}


	public Email() {
		super();
	}


	public Email(String recipient, String subject, String message) {
		super();
		this.recipient = recipient;
		this.subject = subject;
		this.message = message;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRecipient() {
		return recipient;
	}


	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "EmailRequest [id=" + id + ", recipient=" + recipient + ", subject=" + subject + ", message=" + message
				+ "]";
	}
	
	
	
	
	
	
}
