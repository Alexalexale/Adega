package br.adega.service;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.adega.domain.Bebida;
import br.adega.repository.BebidaRepository;

@Service
public class BebidaService {

	@Autowired
	private BebidaRepository bebidaRepository;
	@Autowired
	private EntityManager em;

	public Bebida inserirBebida(Bebida bebida) {
		Bebida save = bebidaRepository.save(bebida);
		return save;
	}

	public Bebida getBebidaMaisVendida() {
		StoredProcedureQuery procedure = em.createNamedStoredProcedureQuery("pc_bebida_mais_vendida");
		procedure.execute();
		Integer codigoMercadoriaMaisVendida = Integer.valueOf((String) procedure.getOutputParameterValue("codigo_mercadoria"));
		Bebida findOne = bebidaRepository.findOne(codigoMercadoriaMaisVendida);
		return findOne;
	}

}
