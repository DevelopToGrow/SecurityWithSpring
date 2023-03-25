/**
 * 
 */
package com.java.knowledge.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Viraj Bansode
 *
 * 18-Mar-2023
 */
@RestController
public class PublicController {

	@GetMapping("/")
	public ModelAndView showWelcomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}
	
	@GetMapping("/public/public1")
	public ResponseEntity<String> showPublic1Page() {
		return new ResponseEntity<>("<h1>Hello, I am public page 1..!</h1>", HttpStatus.OK);
	}
	
	@GetMapping("/public/public2")
	public ResponseEntity<String> showPublic2Page() {
		return new ResponseEntity<>("<h1>Hello, I am public page 2..!</h1>", HttpStatus.OK);
	}
	
}
