package io.github.jeffmmartins.Hospital.API.repository;

import io.github.jeffmmartins.Hospital.API.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, String> {

    // em nome é de acordo com o atributo que tem no objeto.
    List<Paciente> findByNome(String nome);
}
