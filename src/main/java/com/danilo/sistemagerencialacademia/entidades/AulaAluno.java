package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "aula_aluno")
public class AulaAluno {

    @Id
    @Column(name = "aluno_aula_id")
    private UUID id;

    @Column(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @Column(name = "aula_id", nullable = false)
    private Aula aula;

    public AulaAluno(UUID id, Aluno aluno, Aula aula) {
        this.id = id;
        this.aluno = aluno;
        this.aula = aula;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
}
