package com.americanexpress.hackthon.restapi.controller;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController implements HelloWorld{

	
	public String sayHello() {
		return  "This is test service";
	}
}
