package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "aula_aluno")
public class AulaAluno {

    @Column(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @Column(name = "aula_id", nullable = false)
    private Aula aula;

    public AulaAluno(Aluno aluno, Aula aula) {
        this.aluno = aluno;
        this.aula = aula;
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
