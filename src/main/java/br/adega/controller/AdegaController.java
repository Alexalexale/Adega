package br.adega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdegaController {

	@RequestMapping(value = "/")
	public String index(Model model) {
		return "home";
	}

	@RequestMapping(value = "/home")
	public String home(Model model) {
		return "home";
	}

	@RequestMapping(value = "/itens")
	public String itens(Model model) {
		return "itens";
	}

	@RequestMapping(value = "/inserir")
	public String inserir(Model model) {
		return "inserir";
	}

	@RequestMapping(value = "/alterar")
	public String alterar(Model model) {
		return "alterar";
	}

	@RequestMapping(value = "/contribua")
	public String contribua(Model model) {
		return "contribua";
	}

}
