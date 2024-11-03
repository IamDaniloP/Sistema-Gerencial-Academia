package com.danilo.sistemagerencialacademia.repositorio;

import com.danilo.sistemagerencialacademia.entidades.AulaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;


public interface IAulaAlunoRepositorio extends JpaRepository<AulaAluno, UUID> {
    @Query("SELECT a FROM AulaAluno a WHERE a.aula.id = :aulaId AND a.aluno.id = :alunoId ")
    Optional<AulaAluno> consultarInscricaoDeAlunoPorAula(@Param("aulaId") UUID aulaId, @Param("alunoId") UUID alunoId);

    @Query("SELECT COUNT(a) FROM AulaAluno a WHERE a.aula.id = :aulaId")
    Integer consultarQuantidadeDeAlunoPorAula(@Param("aulaId") UUID aulaId);
}
