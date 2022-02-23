package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@GetMapping("/greeting")
	public String greeting(
			//Si viene vacío el parámetro name de la petición GET se rellena con World y se guarda en la variable String name
			@RequestParam(name = "name", required = false, defaultValue = "World") String name, 
			
			//Aquí se almacenan las variables que necesitamos para mostrarlas en una futura vista para el usuario.
			Model model) {	
		
		model.addAttribute("name", name);
		//Hace mención al HTML que queremos mostrar
		return "greeting"; 
	}
}
