package com.danilo.sistemagerencialacademia.repositorio;

import com.danilo.sistemagerencialacademia.entidades.Frequencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IFrequenciaRepositorio extends JpaRepository<Frequencia, UUID> {
}
