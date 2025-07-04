package io.github.jeffmmartins.Arquitetura.spring.todos;

public class TodoValidator {

    //Injeta o repository pois vai precisar acessar ele, cria o construtor para poder injetar;
    private TodoRepository todoRepository;

    public TodoValidator(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    //Metodo que vai recerber um todoEntity para validar
    public void validar(TodoEntity todo){
        if (existeTodoComDescrição(todo.getDescricao())){
            //Exceção padrão
            throw new IllegalArgumentException("Já existe o todo");
        }
    }

    public boolean existeTodoComDescrição(String descricao){
        return todoRepository.existByDescricao(descricao);
    }
}
