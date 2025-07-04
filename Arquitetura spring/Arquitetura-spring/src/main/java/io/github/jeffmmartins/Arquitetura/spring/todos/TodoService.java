package io.github.jeffmmartins.Arquitetura.spring.todos;

import org.springframework.stereotype.Service;

// Camada Lógica.
@Service
public class TodoService {

    private TodoRepository todoRepository;
    public MailSender mailSender;
    public TodoValidator  todoValidator;

    // Adicionar no construtor quais dependências que vai receber;
    public TodoService(TodoRepository todoRepository, TodoValidator todoValidator, MailSender mailSender) {
        this.todoRepository = todoRepository;
        this.todoValidator = todoValidator;
        this.mailSender = mailSender;
    }

    //vai salvar o novotodo com o id já populado.
    public TodoEntity salvar(TodoEntity novoTodo){
        todoValidator.validar(novoTodo);
        // ao ser salvo já retorna com o id populado;
        return todoRepository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo){
        //serve para atualizar;
        todoRepository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluid" : "Não concluido";
        mailSender.enviar("Todo " + todo.getDescricao() + "Foi atualizado para" + status);
    }

    public TodoEntity buscarPorId(Integer id){
        return todoRepository.findById(id).orElse(null);
    }


}
