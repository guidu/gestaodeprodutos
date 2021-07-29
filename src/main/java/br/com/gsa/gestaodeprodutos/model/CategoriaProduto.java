package br.com.gsa.gestaodeprodutos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria_produto")
public class CategoriaProduto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idcategoriaproduto")
	private Long idCategoriaProduto;
	@Column(name = "nome")
	private String nomeCategoria;
	public Long getIdCategoriaProduto() {
		return idCategoriaProduto;
	}
	public void setIdCategoriaProduto(Long idCategoriaProduto) {
		this.idCategoriaProduto = idCategoriaProduto;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
}
