package br.adega.bebida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdegaRestController {

	@Autowired
	private BebidaRepository bebidaRepository;
	
	@RequestMapping(value="/usuario", method = RequestMethod.GET)
	public ResultadoModel cadastrar(){
 
		Bebida bebida = new Bebida();
		
		bebida.setCodigo(2);
		bebida.setDescricao("Wisk 12 anos");
		
		return this.bebidaRepository.cadastrar(bebida);
	}
//	
//	@RequestMapping("/service")
//	public Bebida test() {
//		
//		Bebida bebida = new Bebida();
//		
//		bebida.setCodigo(1);
//		bebida.setDescricao("Bla");
//		
//		return bebida;
//	}
//	
}
