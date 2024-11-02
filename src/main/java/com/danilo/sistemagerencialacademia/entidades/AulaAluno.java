package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "aula_aluno")
public class AulaAluno implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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
