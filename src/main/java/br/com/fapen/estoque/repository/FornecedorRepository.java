package br.com.fapen.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fapen.estoque.domain.entities.Fornecedor;

/**
 * FornecedorRepository
 */
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
}