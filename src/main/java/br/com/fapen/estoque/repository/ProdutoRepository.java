package br.com.fapen.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fapen.estoque.domain.entities.Produto;

/**
 * ProdutoRepository
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}