package br.com.gsa.gestaodeprodutos.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gsa.gestaodeprodutos.dto.ProdutoDTO;

@Entity
@Table(name = "produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproduto")
	private Long idProduto;

	@Column(name = "datacadastro")
	private LocalDate dataCadastro = LocalDate.now();

	@Column(name = "idusuario")
	private Long idUsuario;

	@Column(name = "marcamodelo")
	private String marcaModelo;

	@Column(name = "precocompra")
	private BigDecimal precoCompra;

	@Column(name = "precovenda")
	private BigDecimal precoVenda;

	@Column(name = "descricao")
	private String descricao;

	@ManyToOne
	private CategoriaProduto categoriaProduto;
	
	@ManyToOne
	private CorProduto corProduto;

	public Produto() {
	}

	public Produto(ProdutoDTO produtoDTO) {
		this.idProduto = produtoDTO.getIdProduto();
		this.dataCadastro = produtoDTO.getDataCadastro();
		this.idUsuario = produtoDTO.getIdUsuario();
		this.marcaModelo = produtoDTO.getMarcaModelo();
		this.precoCompra = produtoDTO.getPrecoCompra();
		this.precoVenda = produtoDTO.getPrecoVenda();
		this.descricao = produtoDTO.getDescricao();
		this.categoriaProduto = produtoDTO.getCategoriaProduto();
		this.corProduto = produtoDTO.getCorProduto();
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getMarcaModelo() {
		return marcaModelo;
	}

	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}

	public BigDecimal getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(BigDecimal precoCompra) {
		this.precoCompra = precoCompra;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public CorProduto getCorProduto() {
		return corProduto;
	}

	public void setCorProduto(CorProduto corProduto) {
		this.corProduto = corProduto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(idProduto, other.idProduto);
	}

}
