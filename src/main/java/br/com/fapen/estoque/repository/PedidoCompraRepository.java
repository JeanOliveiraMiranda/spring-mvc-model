package br.com.fapen.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fapen.estoque.domain.entities.PedidoCompra;

/**
 * PedidoCompraRepository
 */
public interface PedidoCompraRepository extends JpaRepository<PedidoCompra, Long>{
}