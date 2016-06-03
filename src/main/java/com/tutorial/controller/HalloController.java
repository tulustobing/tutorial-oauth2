package com.tutorial.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HalloController {

	@RequestMapping("/hallo")
	public void hallo(Model m){
		m.addAttribute("waktu", new Date());
	}
}
