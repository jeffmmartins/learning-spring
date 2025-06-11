package io.github.jeffmmartins.Hospital.API.repository;

import io.github.jeffmmartins.Hospital.API.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, String> {
}
