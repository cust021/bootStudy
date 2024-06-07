package com.study.boot.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLController {

	@GetMapping("/")
	public String Home() {
		return "/html/index";
	}
	
	@GetMapping("/html/**")
	public void goPage() {}
}
