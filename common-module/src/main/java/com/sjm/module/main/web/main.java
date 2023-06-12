package com.sjm.module.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class main {

	//첫화면 이동
	@RequestMapping(value="/")
	public String main() {
		return "main";
	}
}
