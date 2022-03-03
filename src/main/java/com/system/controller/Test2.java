package com.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test2 {
	@ResponseBody
	@RequestMapping("test2")
	public String init() {
		return "Hi Users2";
	}
}
