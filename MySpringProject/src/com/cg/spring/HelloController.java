package com.cg.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
 @RequestMapping("/ ")
	public ModelAndView HelloWorld() {
		ModelAndView model= new ModelAndView();
	 model.addObject("msg" , "HelloWorldddd!!");
	 return model;
	     
 }     
}