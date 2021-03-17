package com.helloworldatividade02.HelloWorldAtividade02.controller;

/*
 * Atividade 2 Spring-boot (minha segunda aplicação):
	Crie uma aplicação spring de hello world.
	
	A aplicação deverá conter um end-point que retorna
	uma string com os seus objetivos de aprendizagem para
	essa semana.
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorldAtividade02")

public class HelloWorldAtividade02Controller {
	@GetMapping
	public String HelloWorldAtividade02()
	{
		return "Estudar MySQL e Sprint";
	}
}
