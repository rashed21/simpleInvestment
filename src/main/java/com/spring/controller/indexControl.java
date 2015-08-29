/**
 * 
 */
package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Emrul
 *
 */
@Controller
public class indexControl {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(){
		
		return "index";
	}
}
