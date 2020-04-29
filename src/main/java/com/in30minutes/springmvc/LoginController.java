package com.in30minutes.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in30minutes.jee.LoginService;

@Controller
public class LoginController {

	/*
	 * //When we directly pass the values then do like this
	 * 
	 * @RequestMapping(value="/login")
	 * 
	 * @ResponseBody public String login() { return "Himanshu Kumar"; }
	 * 
	 */

	// When we don't want the values to be directly passed to client
	// but want to respond with html content then there ViewrResolver comes in
	// action View Resolver.

	// Old fashion before DI
	// LoginService loginService = new LoginService();

	// With DI(Dependency Injection)
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";

	}

	// ModelMap is generally used to store the values and these values can be
	// directly accessed by its key by the view i.e .jsp files

	// In this case we put name in name and password in Password
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		System.out.println("Name : " + name);
		System.out.println("Password : " + password);

		model.put("name", name);
		model.put("Password", password);
		if (loginService.validateUser(name, password))
			return "welcome";

		model.put("errorMessage", "Invalid Credntial!!");
		return "login";

	}

	private void setAttribute(String string, String string2) {
		// TODO Auto-generated method stub

	}

}
