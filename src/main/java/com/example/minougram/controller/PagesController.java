package com.example.minougram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

	// いちらんひょうじ
	@GetMapping("/")
	public String index() {
		return "pages/index";
	}
}
