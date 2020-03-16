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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fapen.estoque.domain.entities.Produto;
import br.com.fapen.estoque.exception.DataNotFoundException;
import br.com.fapen.estoque.repository.ProdutoRepository;

/**
 * ProdutoController
 */
@RestController
@RequestMapping("/v1/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> list() {
        return ResponseEntity.ok(produtoRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public Produto getById(@PathVariable Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElseThrow(() -> new DataNotFoundException("Produto Not Found"));
    }

    @PostMapping
    public ResponseEntity<Produto> post(Produto model) {

        Produto produto = produtoRepository.save(model);

        return ResponseEntity.ok(produto);
    }

    @PutMapping(value = "/{id}")
    public Produto put(@PathVariable Long id, Produto model) {
        Optional<Produto> produto = produtoRepository.findById(id);

        if (produto.isPresent()) {
            model.setIdProduto(id);
            produtoRepository.save(model);
        }

        return produto.orElseThrow(() -> new DataNotFoundException("Produto Not found"));
    }

    @DeleteMapping(value = "/{id}")
    public Produto delete(@PathVariable Long id) {

        Optional<Produto> produto = produtoRepository.findById(id);

        // erro 500 quando não encontra o dado
        if (produto.isPresent()) {
            produtoRepository.deleteById(id);
        }

        return produto.orElseThrow(() -> new DataNotFoundException("Produto Not found"));
    }
}