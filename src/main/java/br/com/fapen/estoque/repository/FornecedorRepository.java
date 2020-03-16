package br.com.fapen.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fapen.estoque.domain.entities.Fornecedor;

/**
 * FornecedorRepository
 */
@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
}