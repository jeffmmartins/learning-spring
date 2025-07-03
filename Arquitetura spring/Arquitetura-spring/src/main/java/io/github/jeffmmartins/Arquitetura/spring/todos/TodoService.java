package io.github.jeffmmartins.Arquitetura.spring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    // Adicionar no construtor quais dependências que vai receber;
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    //vai salvar o novotodo com o id já populado.
    public TodoEntity salvar(TodoEntity novoTodo){
        // ao ser salvo já retorna com o id populado;
        return todoRepository.save(novoTodo);
    }

}
