package io.github.jeffmmartins.Hospital.API.controller;

import io.github.jeffmmartins.Hospital.API.model.Paciente;
import io.github.jeffmmartins.Hospital.API.repository.PacienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private PacienteRepository pacienteRepository;

    public PacienteController(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @PostMapping
    public Paciente salvar(@RequestBody Paciente paciente){
        System.out.println("Paciente recebido: " + paciente);
        var id = UUID.randomUUID().toString();
        paciente.setId(id);
        pacienteRepository.save(paciente);
        return paciente;
    }

    @GetMapping("/{id}") // lidar com as requisições http tipo get
    //Pathvariable -> pega o valor que está no getmapping e atribui a variavel string id do metodo.
    public Paciente obterPorId(@PathVariable("id") String id){
        // pesquisa pelo id, e retorna paciente.
        return pacienteRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletePorId(@PathVariable("id") String id){
        //localização feita pelo id mas é deletado o objeto
        pacienteRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizarPorId(@PathVariable("id") String id, @RequestBody Paciente paciente){
        paciente.setId(id);
        pacienteRepository.save(paciente);
    }

    @GetMapping
    public List<Paciente> buscar(@RequestParam("nome") String nome){

    }
}
