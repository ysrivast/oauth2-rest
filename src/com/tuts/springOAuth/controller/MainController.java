package com.tuts.springOAuth.controller;

import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;
import com.tuts.springOAuth.model.Employee;
import com.tuts.springOAuth.utils.RestURIConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView visitHome() {
		return new ModelAndView("index");
	}
		
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public ModelAndView visitAdmin() {
		ModelAndView model = new ModelAndView("admin");
		model.addObject("title", "Admministrator Control Panel");
		model.addObject("message", "This page demonstrates how to use Spring security.");
		
		return model;
	}

	@RequestMapping(value= RestURIConstants.API_TEST_URL, method = RequestMethod.GET)
	public @ResponseBody
	Employee getDummyEmployee() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Dummy");
		emp.setCreatedDate(new Date());
		return emp;
	}
}
