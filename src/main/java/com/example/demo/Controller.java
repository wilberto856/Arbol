package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/details")
	public String View(Model model) {
		model.addAttribute("Persona", new Persona());
		return "index";
	}
	
	@PostMapping("/details")
	public String Result(Persona persona, Model model){
		model.addAttribute("Nombre", persona.getNombre());
		model.addAttribute("Apellido", persona.getApellido());
		return "result";
	}

}
