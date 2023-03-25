/**
 * 
 */
package com.java.knowledge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.knowledge.bean.LogInDetails;

import com.java.knowledge.bean.LogInDetails;

/**
 * @author Viraj Bansode
 *
 * 13-Mar-2023
 */
@RestController
public class LogInController {

	@GetMapping("/public/login1")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login1");
		return mv;
	}
	
	/*
	 * @PostMapping("/page") public void validateAndLoginUser(LogInDetails details)
	 * {
	 * 
	 * }
	 */
	
}
