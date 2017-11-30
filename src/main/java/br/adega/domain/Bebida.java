package br.adega.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQuery(name = "pc_bebida_mais_vendida", procedureName = "pc_bebida_mais_vendida", parameters = {
		@StoredProcedureParameter(name = "codigo_mercadoria", mode = ParameterMode.OUT, type = String.class) })
public class Bebida {

	@Id
	@GeneratedValue
	@Column(name = "CODIGO_BEBIDA")
	private Integer codigo;
	private String nome;
	private String descricao;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "bebidas")
	private Set<Venda> vendas = new HashSet<Venda>(0);

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
