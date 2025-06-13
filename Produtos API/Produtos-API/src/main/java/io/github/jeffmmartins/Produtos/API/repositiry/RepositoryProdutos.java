package io.github.jeffmmartins.Produtos.API.repositiry;

import io.github.jeffmmartins.Produtos.API.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryProdutos extends JpaRepository<Produto, String> {

    //metodo que vai ser utilizado para buscar produto pelo nome;
    List<Produto> findByNome(String nome);


}
