package com.danilo.sistemagerencialacademia.repositorio;

import com.danilo.sistemagerencialacademia.entidades.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IAlunoRepositorio extends JpaRepository<Aluno, UUID> {
}
