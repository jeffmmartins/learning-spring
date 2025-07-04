package io.github.jeffmmartins.Arquitetura.spring.todos;

import org.springframework.data.jpa.repository.JpaRepository;

//Camada que vai fazer a operação no banco de dados;
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

    boolean existByDescricao(String descricao);
}
