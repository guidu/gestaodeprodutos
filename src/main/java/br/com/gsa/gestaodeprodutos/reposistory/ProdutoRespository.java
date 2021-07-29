package br.com.gsa.gestaodeprodutos.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gsa.gestaodeprodutos.model.Produto;

@Repository
public interface ProdutoRespository extends JpaRepository<Produto, Long> {

}
