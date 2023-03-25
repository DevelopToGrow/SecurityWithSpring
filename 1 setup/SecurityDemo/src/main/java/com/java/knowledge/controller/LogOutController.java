/**
 * 
 */
package com.java.knowledge.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.knowledge.bean.LogOutDetails;

/**
 * @author Viraj Bansode
 *
 * 13-Mar-2023
 */

@RestController
public class LogOutController {

	@PostMapping("/logoutPage")
	public ModelAndView logOutUser(LogOutDetails details){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
}
