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

import br.com.fapen.estoque.domain.entities.Fornecedor;
import br.com.fapen.estoque.exception.DataNotFoundException;
import br.com.fapen.estoque.repository.FornecedorRepository;

/**
 * FornecedorController
 */
@RestController
@RequestMapping("/v1/fornecedores")
public class FornecedorController {

    private final FornecedorRepository fornecedorRepository;

    @Autowired
    public FornecedorController(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @GetMapping
    public ResponseEntity<List<Fornecedor>> list() {
        return ResponseEntity.ok(fornecedorRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public Fornecedor getById(@PathVariable Long id) {
        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);
        return fornecedor.orElseThrow(() -> new DataNotFoundException("Fornecedor not Found"));
    }

    @PostMapping
    public ResponseEntity<Fornecedor> post(Fornecedor model) {

        Fornecedor fornecedor = fornecedorRepository.save(model);

        return ResponseEntity.ok(fornecedor);
    }

    @PutMapping(value = "/{id}")
    public Fornecedor put(@PathVariable Long id, Fornecedor model) {
        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);

        if (fornecedor.isPresent()) {
            model.setIdFornecedor(id);
            fornecedorRepository.save(model);
        }

        return fornecedor.orElseThrow(() -> new DataNotFoundException("Fornecedor not Found"));
    }

    @DeleteMapping(value = "/{id}")
    public Fornecedor delete(@PathVariable Long id) {

        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);

        // erro 500 quando não encontra o cliente
        if (fornecedor.isPresent()) {
            fornecedorRepository.deleteById(id);
        }

        return fornecedor.orElseThrow(() -> new DataNotFoundException("Fornecedor not Found"));
    }
}