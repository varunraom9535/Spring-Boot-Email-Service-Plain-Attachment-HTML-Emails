

# Spring Boot Email Service

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.java.com)
[![Spring Boot](https://img.shields.io/badge/SpringBoot-3.2-green)](https://spring.io/projects/spring-boot)


## Overview

This project is a **Spring Boot-based Email Service** that provides a robust, flexible, and scalable solution for sending emails. It supports sending **plain text emails**, **emails with attachments**, and **HTML emails with attachments**. The application is designed to be easily integrated into any enterprise-grade Java backend system.

The service leverages **Spring Boot**, **JavaMailSender**, and **MIME messages** to ensure reliable email delivery.


---

## Features

1. **Send Plain Text Email**  
   Send a simple email with a subject and message body.

2. **Send Email with Attachment**  
   Attach files like PDFs, images, or documents to your email effortlessly.

3. **Send HTML Email with Attachment**  
   Send rich HTML formatted emails along with file attachments for better presentation.

4. **Error Handling & Validation**  
   Checks for null or invalid recipients and throws meaningful error messages.

5. **Modular & Extensible**  
   Easy to extend for additional features like CC, BCC, inline images, or multiple attachments.

---

## API Endpoints

This project exposes the following methods through a service layer:

| Method | Description |
|--------|-------------|
| `sendEmail(EmailRequest request)` | Sends a simple plain text email. |
| `sendEmailAttachment(EmailRequest request)` | Sends an email with one or more attachments. |
| `sendEmailAttachmentHtmlBody(EmailRequest request)` | Sends an HTML email with attachments. |

---

## Project Structure


```text
SBPEmailSenderProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/varunraom/esp/System/
│   │   │       ├── controller/             # REST controllers
│   │   │       │   └── EmailController.java
│   │   │       ├── model/                  # Email entity and request models
│   │   │       │   ├── Email.java
│   │   │       │   └── EmailRequest.java
│   │   │       ├── repository/             # JPA repository interface
│   │   │       │   └── EmailRepository.java
│   │   │       └── services/               # Service layer
│   │   │           ├── interface/
│   │   │           │   └── EmailService.java
│   │   │           └── impl/
│   │   │               └── EmailServicesImp.java # Implementation
│   │   └── resources/
│   │       ├── static/                     # Static files (attachments, PDFs)
│   │       │   └── varunraom.pdf
│   │       ├── templates/                  # HTML email templates
│   │       │   └── email-content.html
│   │       └── application.properties
│   └── test/
│       └── java/                           # Unit and integration tests
├── pom.xml                                 # Maven dependencies
└── README.md                               # Project documentation
