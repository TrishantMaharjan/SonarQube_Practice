package com.companyname.springprojectdemo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@Autowired
    	private JavaMailSender javaMailSender;
	
	@GetMapping("/contact")
	public String getContact(HttpSession session) {
		if (session.getAttribute("activeuser")==null) {
			return "LoginForm";
		}
		return "ContactForm";
	}
	
	@PostMapping("/contact")
	public String emailSend(@RequestParam String toEmail, @RequestParam String subject, @RequestParam String message) {
		sendEmail(toEmail, subject, message);
		return "ContactForm";
	}
	
	void sendEmail(String toEmail, String subject, String message) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(toEmail);
        //msg.setCc("email@email.com");
        msg.setSubject(subject);
        msg.setText(message);

        javaMailSender.send(msg);

    }
}
