package com.americanexpress.hackthon.restapi.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface HelloWorld {
	
	@GetMapping("/sayHello")
    public String sayHello();
	
	@PostMapping("/pushMessage")
    public void pushMessage();
}
