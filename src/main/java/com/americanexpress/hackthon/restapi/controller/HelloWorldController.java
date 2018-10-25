package com.americanexpress.hackthon.restapi.controller;

import javax.ws.rs.QueryParam;

import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.americanexpress.hackthon.restapi.request.PushRequest;

import javapns.Push;
import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;
import javapns.notification.PushNotificationBigPayload;
@RestController
public class HelloWorldController implements HelloWorld{

	
	public String sayHello() {
		return  "This is test service";
	}

	
	public void pushMessage(@QueryParam(value = "securityData") String securityData, @QueryParam(value = "accountToken") String accountToken,
			@QueryParam(value = "reportid") String reportid, @QueryParam(value = "url") String url) {
		
		
		PushNotificationBigPayload payload = PushNotificationBigPayload.complex();
		try {
			
			payload.setMutableContent(true);
			payload.addCategory("PLAIN");
			
			payload.addCustomAlertTitle("Peter's San Diego Expense Report is Ready");
			payload.addCustomAlertSubtitle("Peter's San Diego Expense Report is Ready");
			payload.addCustomAlertBody("For your Approval");
			payload.addCustomDictionary("media-url", url);
			payload.addCustomDictionary("securityData", securityData);
			payload.addCustomDictionary("account_token", accountToken);
			payload.addCustomDictionary("reportid", reportid);
			String token = "DD963D11693C419B3F2CFB7F119F3B1720C046EE43F05CB7A07BDC83B4F4E2E6";
			try {
				Push.payload(payload, "./certs/OpenAppDevelopment_exp_3-1-2019_SandboxAPNS.p12", "flower11", false, "DD963D11693C419B3F2CFB7F119F3B1720C046EE43F05CB7A07BDC83B4F4E2E6");
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
