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

import br.com.fapen.estoque.domain.entities.Login;
import br.com.fapen.estoque.exception.DataNotFoundException;
import br.com.fapen.estoque.repository.LoginRepository;

/**
 * LoginController
 */
@RestController
@RequestMapping("/v1/login")
public class LoginController {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @GetMapping
    public ResponseEntity<List<Login>> list() {
        return ResponseEntity.ok(loginRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public Login getById(@PathVariable Long id) {
        Optional<Login> login = loginRepository.findById(id);
        return login.orElseThrow(() -> new DataNotFoundException("Usuário não encontrado"));
    }

    @PostMapping
    public ResponseEntity<Login> post(Login model) {
        Login login = loginRepository.save(model);

        return ResponseEntity.ok(login);
    }

    @PutMapping(value = "/{id}")
    public Login put(@PathVariable Long id, Login model) {
        Optional<Login> login = loginRepository.findById(id);

        if (login.isPresent()) {
            model.setIdLogin(id);
            loginRepository.save(model);
        }

        return login.orElseThrow(() -> new DataNotFoundException("Usuário não encontrado"));
    }

    @DeleteMapping(value = "/{id}")
    public Login delete(@PathVariable Long id){
        Optional<Login> login = loginRepository.findById(id);

        // erro 500 quando não encontra o dado
        if (login.isPresent()) {
            loginRepository.deleteById(id);
        }

        return login.orElseThrow(() -> new DataNotFoundException("Usuário não encontrado"));
    }
}