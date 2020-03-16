package br.com.fapen.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fapen.estoque.domain.entities.Produto;

/**
 * ProdutoRepository
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}