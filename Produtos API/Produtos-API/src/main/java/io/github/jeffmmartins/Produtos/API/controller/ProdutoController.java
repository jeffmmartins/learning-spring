package io.github.jeffmmartins.Produtos.API.controller;

import io.github.jeffmmartins.Produtos.API.model.Produto;
import io.github.jeffmmartins.Produtos.API.repositiry.RepositoryProdutos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    private RepositoryProdutos repositoryProdutos;

    public ProdutoController(RepositoryProdutos repositoryProdutos) {
        this.repositoryProdutos = repositoryProdutos;
    }

    @PostMapping
    public void salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);
        // lógica para criar um id aleatório
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        repositoryProdutos.save(produto);
    }
}
