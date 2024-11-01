package com.danilo.sistemagerencialacademia.repositorio;

import com.danilo.sistemagerencialacademia.entidades.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IProfessorRepositorio extends JpaRepository<Professor, UUID> {
}
