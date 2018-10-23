package com.americanexpress.hackthon.restapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;
@RestController
public class HelloWorldController implements HelloWorld{

	
	public String sayHello() {
		return  "This is test service";
	}

	
	public void pushMessage() {
		
		ApnsService service =  APNS.newService().withCert("./certs/OpenAppDevelopment_exp_3-1-2019_SandboxAPNS.p12", "flower11")
			     .withSandboxDestination()
			     .build();
		String payload = APNS.newPayload().alertBody("Hello").build();
		 String token = "DD963D11693C419B3F2CFB7F119F3B1720C046EE43F05CB7A07BDC83B4F4E2E6";
		 service.push(token, payload);
	}
}
