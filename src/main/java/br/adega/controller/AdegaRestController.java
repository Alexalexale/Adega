package br.adega.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.adega.domain.Bebida;
import br.adega.service.BebidaService;

@RestController
public class AdegaRestController {

	@Autowired
	private BebidaService bebidaService;

	@RequestMapping(value = "/saveBebida", method = RequestMethod.GET)
	public Bebida save(Bebida bebida) {
		Bebida bebidaRetorno = bebidaService.inserirBebida(bebida);
		return bebidaRetorno;
	}

	@RequestMapping(value = "/findBebidaMaisVendida", method = RequestMethod.GET)
	public Bebida bebidaMaisVendida() {
		Bebida bebida = bebidaService.getBebidaMaisVendida();
		return bebida;
	}

	@RequestMapping(value = "/findAllBebidas", method = RequestMethod.GET)
	public List<Bebida> todosBebidas() {
		return bebidaService.getAllBebidas();
	}

	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	public Bebida findBebidaById(Integer codigoBebida) {
		return bebidaService.getBebidaById(codigoBebida);
	}

	@RequestMapping(value = "/")
	public String home(Map<String, Object> model) {
		return "home";
	}

}
