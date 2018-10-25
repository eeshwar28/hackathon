package com.americanexpress.hackthon.restapi.controller;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.americanexpress.hackthon.restapi.request.PushRequest;

@RestController
public interface HelloWorld {

	@GetMapping("/sayHello")
	public String sayHello();

	@GetMapping("/pushMessage")
	public void pushMessage(@QueryParam(value = "securityData") String securityData, @QueryParam(value = "accountToken") String accountToken,
			@QueryParam(value = "reportid") String reportid, @QueryParam(value = "url") String url);
}
