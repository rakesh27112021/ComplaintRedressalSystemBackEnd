package com.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class User {
	@ResponseBody
	@RequestMapping("")
	public String init() {
		return "Hi Users";
	}

}
