package com.stackrest.example.springbootdemo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//Simple Method
	//URI-helloworld
	//GET
	//@RequestMapping(method=RequestMethod.GET, path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "HelloWorld";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetail helloWorldBean() {
	return	new UserDetail("Manoj" , "Chhittarka", "Pune");
	}
}
