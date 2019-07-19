package com.aawadall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aawadall.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println("Exercise: "+exercise.getMinutes());
		return "redirect:addMoreMinutes.html";
	}
	
	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println("Exercise More: "+exercise.getMinutes());
		return "addMinutes";
	}
}
