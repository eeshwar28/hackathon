package com.someshwar.services.server;

import java.util.Date;

import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;
import com.notnoop.apns.EnhancedApnsNotification;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jsonString = "{\"aps\": {\"alert\": {\"body\": \"Push notification body\",\"title\": \"Push notification title\"},\"mutable-content\": 1,\"category\": \"rich-apns\" }, \"media-url\": \"https://i.imgur.com/t4WGJQx.jpg\"}";
		System.out.println("Hello World...");
		ApnsService service =  APNS.newService().withCert("./certs/OpenAppDevelopment_exp_3-1-2019_SandboxAPNS.p12", "flower11")
			     .withSandboxDestination()
			     .build();
		//String payload = APNS.newPayload().alertBody("Will send Notification Later").build();
		 String token = "DD963D11693C419B3F2CFB7F119F3B1720C046EE43F05CB7A07BDC83B4F4E2E6";
		 service.push(token, jsonString);
		 
		/* String payload = APNS.newPayload()
		            .badge(3)
		            .customField("secret", "what do you think?")
		            .localizedKey("ExpenseReportSubmittedBy")
		            .localizedArguments("Jenna", "Frank")
		            .actionKey("Play").build();

		 int now =  (int)(new Date().getTime()/1000);

		 EnhancedApnsNotification notification = new EnhancedApnsNotification(EnhancedApnsNotification.INCREMENT_ID(),
		     now + 60 * 60 ,
		     token ,
		     payload);

		 service.push(notification);*/
		 
	}

}
