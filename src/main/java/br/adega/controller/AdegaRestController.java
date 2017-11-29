package br.adega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.adega.domain.Bebida;
import br.adega.domain.ResultadoModel;
import br.adega.repository.BebidaRepository;

@RestController
public class AdegaRestController {

	@Autowired
	private BebidaRepository bebidaRepository;

	@RequestMapping(value = "/addBebida", method = RequestMethod.GET)
	public ResultadoModel cadastrar(Bebida bebida) {
		ResultadoModel resultadoModel = new ResultadoModel(1, "OK");
		bebidaRepository.save(bebida);
		return resultadoModel;
	}

}
