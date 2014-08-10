package com.admin.portal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.portal.Common.CommonController;

@Controller
public class HomeController extends CommonController{

	@RequestMapping("/")
	public String home(Model model){
		System.out.println("home page");
		String msg="Welcome to Admin portal";
		model.addAttribute("message", msg);
		return "home";
	}
	
	
}
