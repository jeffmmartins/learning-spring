package io.github.jeffmmartins.Produtos.API.repositiry;

import io.github.jeffmmartins.Produtos.API.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProdutos extends JpaRepository<Produto, String> {
}
