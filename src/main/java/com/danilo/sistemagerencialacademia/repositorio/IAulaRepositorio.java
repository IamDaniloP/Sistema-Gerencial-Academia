package com.danilo.sistemagerencialacademia.repositorio;

import com.danilo.sistemagerencialacademia.entidades.Aula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IAulaRepositorio extends JpaRepository<Aula, UUID> {
}
