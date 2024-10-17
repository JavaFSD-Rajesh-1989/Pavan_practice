package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.entity.WhatsAppDetails;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.whatsAppServiceInterface;

public class WhatsappController implements whatsAppControllerInterface {
	Scanner sc = new Scanner(System.in);

	@Override
	public void loginWhatsApp() {
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		
		WhatsAppDetails wd = new WhatsAppDetails();
		wd.setName(name);
		wd.setPassword(password);
		
		whatsAppServiceInterface ws = new WhatsappService();
		ws.loginWhatsApp(wd);
	}

	@Override
	public void signupWhatsApp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteWhatsApp() {
		// TODO Auto-generated method stub
		
	}

}
