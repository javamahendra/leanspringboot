package com.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {

	@GetMapping("/hello")
	public String home(Locale locale, Model model) {
		System.out.println("Home Controller Class");
		Date date = new Date();
System.out.println("Home Controller Class");
System.out.println("Home Controller Class");
System.out.println("Home Controller Class");
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		System.out.println("Home Controller Class");
		return "home";
	}
	
	@GetMapping("/ma")
	public String method1(Locale locale, Model model) {
		System.out.println("Home Controller Method-1");
		
		return "method -1";
	}

}
