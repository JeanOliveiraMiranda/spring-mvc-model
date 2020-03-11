package br.com.fapen.estoque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ViewsController
 */
@Controller
public class ViewsController {

    @RequestMapping(value = "/produtos/novo", method = RequestMethod.GET)
    public String novoProdutoPage() {
        return "produtos/produto";
    }

}