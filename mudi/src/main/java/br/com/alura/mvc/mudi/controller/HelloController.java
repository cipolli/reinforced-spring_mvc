package br.com.alura.mvc.mudi.controller;

import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Mundo");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		model.addAttribute("time", timestamp);
		return "hello";
	}

}
