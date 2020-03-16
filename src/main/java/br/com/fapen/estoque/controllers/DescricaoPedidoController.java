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

import br.com.fapen.estoque.domain.entities.DescricaoPedido;
import br.com.fapen.estoque.exception.DataNotFoundException;
import br.com.fapen.estoque.repository.DescricaoPedidoRepository;

/**
 * DescricaoPedidoController
 */
@RestController
@RequestMapping("/v1/pedidos")
public class DescricaoPedidoController {

    private final DescricaoPedidoRepository descricaoPedidoRepository;

    @Autowired
    public DescricaoPedidoController(DescricaoPedidoRepository descricaoPedidoRepository) {
        this.descricaoPedidoRepository = descricaoPedidoRepository;
    }

    @GetMapping
    public ResponseEntity<List<DescricaoPedido>> list() {
        return ResponseEntity.ok(descricaoPedidoRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public DescricaoPedido DescricaoPedidoId(@PathVariable Long id) {
        Optional<DescricaoPedido> descricaoPedido = descricaoPedidoRepository.findById(id);
        return descricaoPedido.orElseThrow(() -> new DataNotFoundException("DescricaoPedido not Found"));
    }

    @PostMapping
    public ResponseEntity<DescricaoPedido> post(DescricaoPedido model) {

        DescricaoPedido DescricaoPedido = descricaoPedidoRepository.save(model);

        return ResponseEntity.ok(DescricaoPedido);
    }

    @PutMapping(value = "/{id}")
    public DescricaoPedido put(@PathVariable Long id, DescricaoPedido model) {
        Optional<DescricaoPedido> DescricaoPedido = descricaoPedidoRepository.findById(id);

        if (DescricaoPedido.isPresent()) {
            model.setIdProduto(id);
            descricaoPedidoRepository.save(model);
        }

        return DescricaoPedido.orElseThrow(() -> new DataNotFoundException("DescricaoPedido not Found"));
    }

    @DeleteMapping(value = "/{id}")
    public DescricaoPedido delete(@PathVariable Long id) {

        Optional<DescricaoPedido> descricaoPedido = descricaoPedidoRepository.findById(id);

        // erro 500 quando não encontra o cliente
        if (descricaoPedido.isPresent()) {
            descricaoPedidoRepository.deleteById(id);
        }

        return descricaoPedido.orElseThrow(() -> new DataNotFoundException("DescricaoPedido not Found"));
    }
}