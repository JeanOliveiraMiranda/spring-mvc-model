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

import br.com.fapen.estoque.domain.entities.Pessoa;
import br.com.fapen.estoque.exception.DataNotFoundException;
import br.com.fapen.estoque.repository.PessoaRepository;

@RestController
@RequestMapping("/v1/fornecedores")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> list() {
        return ResponseEntity.ok(pessoaRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public Pessoa getById(@PathVariable Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.orElseThrow(() -> new DataNotFoundException("Pessoa not Found"));
    }

    @PostMapping
    public ResponseEntity<Pessoa> post(Pessoa model) {

        Pessoa pessoa = pessoaRepository.save(model);

        return ResponseEntity.ok(pessoa);
    }

    @PutMapping(value = "/{id}")
    public Pessoa put(@PathVariable Long id, Pessoa model) {
        Optional<Pessoa> fornecedor = pessoaRepository.findById(id);

        if (fornecedor.isPresent()) {
            model.setIdPessoa(id);
            pessoaRepository.save(model);
        }

        return fornecedor.orElseThrow(() -> new DataNotFoundException("Pessoa not Found"));
    }

    @DeleteMapping(value = "/{id}")
    public Pessoa delete(@PathVariable Long id) {

        Optional<Pessoa> pessoa = pessoaRepository.findById(id);

        // erro 500 quando não encontra o dado
        if (pessoa.isPresent()) {
            pessoaRepository.deleteById(id);
        }

        return pessoa.orElseThrow(() -> new DataNotFoundException("Pessoa not Found"));
    }
}