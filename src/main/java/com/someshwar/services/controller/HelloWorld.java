package com.someshwar.services.controller;



import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface HelloWorld {
	
	@GetMapping("/sayHello")
    public String sayHello();
}
