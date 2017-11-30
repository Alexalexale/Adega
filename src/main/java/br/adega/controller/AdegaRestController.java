package br.adega.controller;

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

	@RequestMapping(value = "/addBebida", method = RequestMethod.GET)
	public Bebida cadastrar(Bebida bebida) {
		Bebida save = bebidaService.inserirBebida(bebida);
		return save;
	}

	@RequestMapping(value = "/bebidaMaisVendida", method = RequestMethod.GET)
	public Bebida bebidaMaisVendida() {
		Bebida findOne = bebidaService.getBebidaMaisVendida();
		return findOne;
	}

}
