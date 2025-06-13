package io.github.jeffmmartins.Produtos.API.controller;

import io.github.jeffmmartins.Produtos.API.model.Produto;
import io.github.jeffmmartins.Produtos.API.repositiry.RepositoryProdutos;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    private RepositoryProdutos repositoryProdutos;

    public ProdutoController(RepositoryProdutos repositoryProdutos) {
        this.repositoryProdutos = repositoryProdutos;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);
        // lógica para criar um id aleatório
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        repositoryProdutos.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        // retorna o produto localizado pelo o id caso exista noa existindo retorna null;
        return repositoryProdutos.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id){
        repositoryProdutos.deleteById(id);
    }

    @PutMapping("{id}")
    //RequestBody pega o copor da requisição e transforma em um objeto
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto){
        produto.setId(id);
        repositoryProdutos.save(produto);
    }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome){

    }

}
