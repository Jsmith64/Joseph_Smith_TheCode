package com.scopeless64.thecode;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class Home {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		if(session.getAttribute("res") == null) {
			session.setAttribute("res", "correct");
		}
		return "home.jsp";
	}
	
	@RequestMapping(path="process", method=RequestMethod.POST)
	public String processpass(@RequestParam(value="code") String code, HttpSession session) {
		String pass = "bushido";
		if(code.equals(pass)) {
			session.setAttribute("res", null);
			return "redirect:/code";
		}
		else {
			session.setAttribute("res", "incorrect");
			return "redirect:/";	
		}
	}
	
	@RequestMapping("/code")
	public String successful() {
		return "code.jsp";
	}
}
