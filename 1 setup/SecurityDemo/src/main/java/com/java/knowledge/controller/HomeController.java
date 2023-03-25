/**
 * 
 */
package com.java.knowledge.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Viraj Bansode
 *
 * 13-Mar-2023
 */

@RestController
public class HomeController {

	
	@GetMapping("/home")
	public ResponseEntity<String> showDashbaord() {
		return new ResponseEntity<>("<h1>Hello, You are at home page...</h1>", HttpStatus.OK);
	}
	
}
