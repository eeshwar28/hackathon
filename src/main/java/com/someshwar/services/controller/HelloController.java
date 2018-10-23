/**
 * 
 */
package com.someshwar.services.controller;

import javax.ws.rs.Path;

@Path("/hello")
public class HelloController implements HelloWorld{

	
	public String sayHello() {
		return  "This is test service";
	}

}
