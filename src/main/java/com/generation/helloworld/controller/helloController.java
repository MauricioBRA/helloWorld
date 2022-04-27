package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {
	
	@GetMapping
	public String hello() {
		return "hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação <br /> Persistência <br /> Proatividade <br />"
				+ "Trabalho em equipe <br /> Crescimento <br />"
				+ "Responsabilidade Pessoal <br /> Orientação ao Futuro <br />"
				+ "Orientação ao Detalhe <br /> Dar e Receber";
	}
	
	@GetMapping("/semana")
	public String semana() {
		return "Nesta semana de aprendizagem, aprendi como fazer um diagrama no MySql <br />"
				+ "e como através dele conseguimos gerar um código sql de forma simples. <br />"
				+ "Também comecei a construção do blog pessoal, e o Projeto Integrador.";
	}
}
