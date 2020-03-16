package br.com.fapen.estoque.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fapen.estoque.domain.entities.PedidoCompra;
import br.com.fapen.estoque.exception.DataNotFoundException;
import br.com.fapen.estoque.repository.PedidoCompraRepository;

@RestController
@RequestMapping("/v1/compra")
public class PedidoCompraController {

    private final PedidoCompraRepository pedidoCompraRepository;

    @Autowired
    public PedidoCompraController(PedidoCompraRepository pedidoCompraRepository) {
        this.pedidoCompraRepository = pedidoCompraRepository;
    }

    @GetMapping
    public ResponseEntity<List<PedidoCompra>> list() {
        return ResponseEntity.ok(pedidoCompraRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public PedidoCompra getById(@PathVariable Long id) {
        Optional<PedidoCompra> pedidoCompra = pedidoCompraRepository.findById(id);
        return pedidoCompra.orElseThrow(() -> new DataNotFoundException("PedidoCompra not Found"));
    }

    @PostMapping
    public ResponseEntity<PedidoCompra> post(PedidoCompra model) {

        PedidoCompra pedidoCompra = pedidoCompraRepository.save(model);

        return ResponseEntity.ok(pedidoCompra);
    }

    @PutMapping(value = "/{id}")
    public PedidoCompra put(@PathVariable Long id, PedidoCompra model) {
        Optional<PedidoCompra> pedidoCompra = pedidoCompraRepository.findById(id);

        if (pedidoCompra.isPresent()) {
            model.setIdPedido(id);
            pedidoCompraRepository.save(model);
        }

        return pedidoCompra.orElseThrow(() -> new DataNotFoundException("PedidoCompra not Found"));
    }

    @DeleteMapping(value = "/{id}")
    public PedidoCompra delete(@PathVariable Long id) {

        Optional<PedidoCompra> pedidoCompra = pedidoCompraRepository.findById(id);

        // erro 500 quando não encontra o dado
        if (pedidoCompra.isPresent()) {
            pedidoCompraRepository.deleteById(id);
        }

        return pedidoCompra.orElseThrow(() -> new DataNotFoundException("PedidoCompra not Found"));
    }
}