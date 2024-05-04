package com.learningbasic.mysbproject.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	AuthenticateUser user;
	

	public LoginController(AuthenticateUser user) {
		super();
		this.user = user;
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String openLogin(){
		return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String openWelcome(@RequestParam String name, @RequestParam String password, ModelMap model){
		if(user.authentication(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
		model.put("errormsg", "Wrong name/pass try again!");
		return "login";
		
	}
}
