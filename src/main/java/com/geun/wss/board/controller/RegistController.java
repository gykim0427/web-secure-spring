package com.geun.wss.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class RegistController {
	@GetMapping(value = { "/regist" }, produces = { "application/json" })
	public ModelAndView login(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		ModelAndView view = new ModelAndView();
		view.setViewName("views/regist");
		
		return view;
	}
}
