package br.adega.bebida;

public class QueryRepository {

	/*INSERIR UMA NOVA BEBIDA*/
	public static final String INSERIR_BEBIDA = "create or replace procedure INSERT_BEBIDAS as begin insert into bebidas(codigo, descricao) VALUES(2, 'wisk');";
	
	public static final String EXEC = "exec INSERT_BEBIDAS;";
 
}
