package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "aula_aluno")
public class AulaAluno {

    @Column(name = "aula_id")
    private Aula aula;

    @Column(name = "aluno_id")
    private Aluno aluno;

    public AulaAluno(Aluno aluno, Aula aula) {
        this.aluno = aluno;
        this.aula = aula;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
