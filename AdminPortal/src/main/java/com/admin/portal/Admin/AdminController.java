package com.admin.portal.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.portal.Common.CommonController;

@Controller
@RequestMapping("/admin")
public class AdminController  extends CommonController{

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String home(Model model){
		System.err.println("admin login page");
		
		return "admin/adminLogin";
	}
	
}
