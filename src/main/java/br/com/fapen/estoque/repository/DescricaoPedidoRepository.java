package br.com.fapen.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fapen.estoque.domain.entities.DescricaoPedido;

/**
 * DescricaoPedidoRepository
 */
public interface DescricaoPedidoRepository extends JpaRepository<DescricaoPedido, Long>{
}