package br.adega.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.adega.domain.Bebida;

@Repository
public interface BebidaRepository extends CrudRepository<Bebida, Integer> {

	@Procedure(name = "pc_bebida_mais_vendida")
	String pcBebidasMaisVendida();

}
