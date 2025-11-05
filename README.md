

# Spring Boot Email Service

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.java.com)
[![Spring Boot](https://img.shields.io/badge/SpringBoot-3.2-green)](https://spring.io/projects/spring-boot)


## Overview

This project is a **Spring Boot-based Email Service** that supports:

✅ Plain Text Emails  
✅ Emails with Attachments  
✅ HTML Emails with Attachments  

It is lightweight, modular, and easy to integrate into any Java backend system.  
Powered by **JavaMailSender + Spring Boot + MIME messages**.

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
```

---

## ⚙️ Tech Stack
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Mail (JavaMailSender)**
- **Thymeleaf (for HTML templates)**
- **Maven**
- **Lombok**

## 🚀 Setup Instructions

1. **Clone the repository**

### ✅ 1. Clone the repository
```bash
git clone https://github.com/varunraom9535/Spring-Boot-Email-Service-Plain-Attachment-HTML-Emails.git
cd Spring-Boot-Email-Service-Plain-Attachment-HTML-Emails
```

### ✅ 2. Configure your email in `application.properties`
```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your_email@gmail.com
spring.mail.password=your_app_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

### ✅ 3. Run the Application
```bash
mvn spring-boot:run
```

---


## 📬 Sample API Request

### ✅ Send Plain Email  
```json
{
  "to": "user@example.com",
  "subject": "Hello!",
  "body": "This is a plain text email."
}
```

### ✅ Send Email with Attachment  
```json
{
  "to": "user@example.com",
  "subject": "Document",
  "body": "Please find the attachment.",
  "attachment": "varunraom.pdf"
}
```

---

## 🔮 Future Enhancements

- ✅ CC & BCC support  
- ✅ Multiple attachments  
- ✅ Inline images  
- ✅ Email scheduling  
- ✅ AWS SES / SendGrid integration  

---

## 👨‍💻 Author
**Varun Rao M**
- GitHub: [@varunraom9535](https://github.com/varunraom9535)
- LinkedIn: [Your LinkedIn Profile](https://linkedin.com/in/your-linkedin)
