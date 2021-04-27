package com.example.demo;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class workController {

	@RequestMapping("/work")
     public String text(Model model) {
		
		model.addAttribute("text", "주미, 22, 동두천");
		
		
		return "work";
	}
	
	@RequestMapping("/work")
    public String list(Model model) {

		model.addAttribute("menu1", "설렁탕");
		model.addAttribute("menu2", "닭볶음탕");
		model.addAttribute("menu3", "소주");
		model.addAttribute("menu4", "맥주");
		model.addAttribute("menu5", "양주");
		
		return "work";
	}
}
