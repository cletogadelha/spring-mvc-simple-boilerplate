package com.cletogadelha.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControler {
	
	@GetMapping("/hello")   
    public String greet(){
        return "hello";
    }

}
