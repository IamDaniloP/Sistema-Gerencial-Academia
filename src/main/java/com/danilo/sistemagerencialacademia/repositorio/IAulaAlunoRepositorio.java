package com.danilo.sistemagerencialacademia.repositorio;

import com.danilo.sistemagerencialacademia.entidades.AulaAluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IAulaAlunoRepositorio extends JpaRepository<AulaAluno, UUID> {
}
