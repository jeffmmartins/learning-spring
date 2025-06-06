package io.github.jeffmmartins.Produtos.API.repositiry;

import io.github.jeffmmartins.Produtos.API.model.Produto;
import org.springframework.data.repository.Repository;

public interface ProdutoRepository extends Repository<Produto, String> {
}
