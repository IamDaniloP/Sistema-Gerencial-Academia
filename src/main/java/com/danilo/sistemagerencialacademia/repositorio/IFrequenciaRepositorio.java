package com.danilo.sistemagerencialacademia.repositorio;

import com.danilo.sistemagerencialacademia.entidades.Frequencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface IFrequenciaRepositorio extends JpaRepository<Frequencia, UUID> {

    @Query("SELECT f FROM Frequencia f WHERE f.aulaAluno = :aulaAlunoId")
    List<Frequencia> consultarFrequenciaDeAlunoPorAula(@Param("aulaAlunoId") UUID aulaAlunoId);
}
