package com.geun.wss.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
	@GetMapping(value = { "/" }, produces = { "application/json" })
	public ModelAndView empam0210m(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		ModelAndView view = new ModelAndView();
		view.setViewName("views/login");
		
		return view;
	}
}
