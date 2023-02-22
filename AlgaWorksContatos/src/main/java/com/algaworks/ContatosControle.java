package com.algaworks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosControle {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}

//cant resolve getmapping solution https://stackoverflow.com/questions/56712560/cannot-resolve-getmapping-in-spring-tool-suite