package br.adega.bebida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
