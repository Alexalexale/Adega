package br.adega.repository;

public class QueryRepository {

	/* INSERIR UMA NOVA BEBIDA */
	public static final String INSERIR_BEBIDA = "CREATE OR REPLACE PROCEDURE INSERT_BEBIDAS AS BEGIN INSERT INTO BEBIDAS(CODIGO, DESCRICAO) VALUES(2, 'WISK');";
	public static final String EXEC = "EXEC INSERT_BEBIDAS;";

}
