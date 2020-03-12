package br.com.fapen.estoque.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ProdutoViewController
 */
@Controller
@RequestMapping("/produtos")
public class ProdutoViewController {

    @GetMapping
    public String novoProdutoPage() {
        return "produtos/produto";
    }

}