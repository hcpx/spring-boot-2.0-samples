package com.bee.sample.ch2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {
	@RequestMapping("/sayhello.html")
	public @ResponseBody String say(){
		return "hello world";
	}
	
	@RequestMapping("/say.html")
	public @ResponseBody String say(String name){
		return "hello world "+name;
	}
}
