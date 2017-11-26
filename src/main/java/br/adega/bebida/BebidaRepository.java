package br.adega.bebida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BebidaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
 
	/**
	 * ESSE MÉTODO CADASTRA UM NOVO USUÁRIO NO BANCO DE DADOS	
	 * @param usuario
	 * @return
	 */
	public ResultadoModel cadastrar(Bebida bebida){
 
		try {
 
			jdbcTemplate.update(QueryRepository.INSERIR_BEBIDA);
 
			jdbcTemplate.execute("exec INSERT_BEBIDAS;");
			
		} catch (Exception e) {
 
			return new ResultadoModel(0,"Erro ao cadastrar o registro! detalhe:" + e.getMessage());	
		}
 
		return new ResultadoModel(1,"Registro cadastrado com sucesso!");
	}
	
}
