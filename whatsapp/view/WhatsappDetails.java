package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;
import com.whatsapp.controller.whatsAppControllerInterface;

public class WhatsappDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to WhatsApp");
		System.out.println("Select 1 for login");
		System.out.println("Select 2 for signup");
		System.out.println("Select 3 for delete");
		
		whatsAppControllerInterface wc = new WhatsappController();
		
		
		int n = sc.nextInt();
		switch(n) {
		case 1:
			wc.loginWhatsApp();
			break;
		case 2:
			wc.signupWhatsApp();
			break;
		case 3:
			wc.deleteWhatsApp();
			break;
		default:
			System.out.println("Go and die");
		}
	}

}
