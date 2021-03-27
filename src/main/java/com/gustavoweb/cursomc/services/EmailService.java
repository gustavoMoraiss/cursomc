package com.gustavoweb.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.gustavoweb.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
	
}
