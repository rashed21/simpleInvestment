/**
 * 
 */
package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Emrul
 *
 */
@Controller
public class ShowControl {
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String show(ModelMap m){
		
		m.addAttribute("user", "emrul");
		
		return "showMessage";
	}

}
