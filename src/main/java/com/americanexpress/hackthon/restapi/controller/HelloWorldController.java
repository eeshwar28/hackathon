package com.americanexpress.hackthon.restapi.controller;

import java.util.Arrays;

import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.americanexpress.hackthon.restapi.request.PushRequest;
import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;

import javapns.Push;
import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;
import javapns.notification.PushNotificationBigPayload;
@RestController
public class HelloWorldController implements HelloWorld{

	
	public String sayHello() {
		return  "This is test service";
	}

	
	public void pushMessage(@RequestHeader String deviceToken, @RequestBody PushRequest pushRequest) {
		
		
		PushNotificationBigPayload payload = PushNotificationBigPayload.complex();
		try {
			
			payload.setMutableContent(true);
			payload.addCategory("PLAIN");
			System.out.println("Response -> " +pushRequest.toString());
			payload.addCustomAlertTitle(pushRequest.getAlertTitle());
			payload.addCustomAlertSubtitle(pushRequest.getAlertSubTitle());
			payload.addCustomAlertBody(pushRequest.getAlertBody());
			payload.addCustomDictionary("media-url", pushRequest.getAlertattachment());
			payload.addCustomDictionary("securityData", pushRequest.getSecurityData());
			payload.addCustomDictionary("account_token", pushRequest.getAccountToken());
			String token = "DD963D11693C419B3F2CFB7F119F3B1720C046EE43F05CB7A07BDC83B4F4E2E6";
			try {
				Push.payload(payload, "./certs/OpenAppDevelopment_exp_3-1-2019_SandboxAPNS.p12", "flower11", false, deviceToken);
			} catch (CommunicationException | KeystoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
		 //service.push(token, payload);
	}
}
