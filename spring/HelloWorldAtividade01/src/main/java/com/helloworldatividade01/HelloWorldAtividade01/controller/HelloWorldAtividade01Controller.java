package com.helloworldatividade01.HelloWorldAtividade01.controller;

/*
 * Atividades Spring-boot - 16/03
	
	Atividade 1 Spring-boot (minha primeira aplicação):
	Crie uma aplicação spring de hello world.
	
	A aplicação deverá conter um end-point que retorna
	uma string com as habilidades e mentalidades que você
	utilizou para realizar essa atividade.
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorldAtividade01")

public class HelloWorldAtividade01Controller {
	@GetMapping
	public String HelloWorldAtividade01()
	{
		return "Persistência \nAtenção aos detalhes";
	}
}
