package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello1")
public class Controller {
	
	@GetMapping
	public String hello() {
		return "Nesta atividade eu utilizei a mentalide de persistência e a habilidade de comunicação para conversar com meus colegas!S";
		
	}

}
