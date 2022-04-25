package br.com.gsa.gestaodeprodutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gsa.gestaodeprodutos.dto.ProdutoDTO;
import br.com.gsa.gestaodeprodutos.model.Produto;
import br.com.gsa.gestaodeprodutos.server.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping("inserir")
	public ResponseEntity<?> inserirProduto(@RequestBody ProdutoDTO produtoDTO) {
		try {
			Produto produto = ProdutoDTO.converteEmProduto(produtoDTO);
			produtoService.inserir(produto);
			return ResponseEntity.ok(HttpStatus.OK);
		} catch(Exception e) {
			return ResponseEntity.ok(HttpStatus.NOT_FOUND);
		}
	}
}
