package br.com.fapen.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fapen.estoque.domain.entities.Pessoa;

/**
 * PessoaRepository
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
}