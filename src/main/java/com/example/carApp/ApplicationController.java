package com.example.carApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ApplicationController {
	
	@RequestMapping("/index")
	public String goHome() {
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/logout")
	public String logout() {
		return "login";
	}

}
