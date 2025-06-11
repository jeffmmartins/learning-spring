package io.github.jeffmmartins.Hospital.API.controller;

import io.github.jeffmmartins.Hospital.API.model.Paciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @PostMapping
    public Paciente salvar(@RequestBody Paciente paciente){
        System.out.println("Paciente recebido: " + paciente);
        return paciente;
    }
}
