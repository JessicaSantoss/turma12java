package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello2")
public class Controller {
	
	@GetMapping
	public String hello2() {
		return "Nesta semana tenho objetivo de aprendizagem continuar me aprofundando no STS, MySQL e focar também na habilidade de trabalho em equipe e comunicação, sinto que ainda tenho muito que melhorar nesses dois aspectos.";
		
	}

}

