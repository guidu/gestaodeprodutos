package br.com.gsa.gestaodeprodutos.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsa.gestaodeprodutos.model.Produto;
import br.com.gsa.gestaodeprodutos.reposistory.ProdutoRespository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRespository produtoRespository;
	public void inserir(Produto produto) {
		produtoRespository.save(produto);
	}

}
