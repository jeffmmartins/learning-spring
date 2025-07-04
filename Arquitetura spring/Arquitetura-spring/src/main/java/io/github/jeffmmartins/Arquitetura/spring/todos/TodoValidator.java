package io.github.jeffmmartins.Arquitetura.spring.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    //Injeta o repository pois vai precisar acessar ele, cria o construtor para poder injetar;
    private TodoRepository todoRepository;

    public TodoValidator(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    //Metodo que vai recerber um todoEntity para validar
    public void validar(TodoEntity todo){
        if (existeTodoComDescricao(todo.getDescricao())){
            //Exceção padrão
            throw new IllegalArgumentException("Já existe o todo");
        }
    }

    public boolean existeTodoComDescricao(String descricao){
        return todoRepository.existsByDescricao(descricao);
    }
}
