package com.whatsapp.service;

import com.whatsapp.dao.WhatsAppDao;
import com.whatsapp.dao.whatAppDaoInterface;
import com.whatsapp.entity.WhatsAppDetails;

public class WhatsappService implements whatsAppServiceInterface {

	@Override
	public void loginWhatsApp(WhatsAppDetails wd) {
		String name = wd.getName();
		String password = wd.getPassword();
		
		whatAppDaoInterface wid = new WhatsAppDao();
		
		if(name.equals("pavan")&& password.equals("123"))
		{
			System.out.println("Congratulations");
			wid.loginWhatsApp();
		}else
		{
			return;
		}
				
	}
	

}
