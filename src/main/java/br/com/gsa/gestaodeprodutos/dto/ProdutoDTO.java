package br.com.gsa.gestaodeprodutos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.gsa.gestaodeprodutos.model.CategoriaProduto;
import br.com.gsa.gestaodeprodutos.model.CorProduto;
import br.com.gsa.gestaodeprodutos.model.Produto;

public class ProdutoDTO {
	private Long idProduto;

	private LocalDate dataCadastro;
	private Long idUsuario;
	private String marcaModelo;
	private BigDecimal precoCompra;
	private BigDecimal precoVenda;
	private String descricao;
	private CategoriaProduto categoriaProduto;
	private CorProduto corProduto;
	
	public ProdutoDTO() {
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

	public static Produto converteEmProduto(ProdutoDTO produtoDTO) {
		return new Produto(produtoDTO);
	}
}
