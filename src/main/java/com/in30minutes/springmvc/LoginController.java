package com.in30minutes.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	
	/*//When we directly pass the values then do like this 
	 * @RequestMapping(value="/login")
	 * 
	 * @ResponseBody public String login() { return "Himanshu Kumar"; }
	 * 
	 */	
	
	//When we don't want the values to be directly passed to client
	//but want to respond with html content then there ViewrResolver comes in 
	//action View Resolver.
	 @RequestMapping(value="/login")

	 public String login() {
		 return "login";
		 
	 }
	 
		
}
