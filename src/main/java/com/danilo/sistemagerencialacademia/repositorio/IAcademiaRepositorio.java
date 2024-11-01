package com.danilo.sistemagerencialacademia.repositorio;

import com.danilo.sistemagerencialacademia.entidades.Academia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IAcademiaRepositorio extends JpaRepository<Academia, UUID> {

}
