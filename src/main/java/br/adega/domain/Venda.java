package br.adega.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Venda {

	@Id
	@GeneratedValue
	@Column(name = "CODIGO_VENDA")
	private Integer codigo;
	private String valorTotal;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ITEM_VENDA", 
			   joinColumns = { @JoinColumn(name = "CODIGO_VENDA") }, 
			   inverseJoinColumns = { @JoinColumn(name = "CODIGO_BEBIDA") })
	private Set<Bebida> bebidas = new HashSet<Bebida>(0);

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Set<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(Set<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

}
