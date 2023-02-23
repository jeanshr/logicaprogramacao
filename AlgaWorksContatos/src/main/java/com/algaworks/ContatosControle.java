package com.algaworks;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();//constante estática do tipo arraylist

	//bloco estático
	static {
		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 31 0000 0000"));
		LISTA_CONTATOS.add(new Contato("2", "João", "+55 32 1111 1111"));
		LISTA_CONTATOS.add(new Contato("3", "Normandes", "+55 33 2222 2222"));
		LISTA_CONTATOS.add(new Contato("4", "Thiago", "+55 34 3333 3333"));
		LISTA_CONTATOS.add(new Contato("5", "Alexandre", "+55 35 4444 4444"));
	}
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		return modelAndView;
	}
}

//cant resolve getmapping solution https://stackoverflow.com/questions/56712560/cannot-resolve-getmapping-in-spring-tool-suite