package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "frequencia")
public class Frequencia {

    @Column(name = "data_ida", nullable = false)
    private Date dataIda;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    public Frequencia(Date dataIda, Aluno aluno) {
        this.dataIda = dataIda;
        this.aluno = aluno;
    }

    public Date getDataIda() {
        return dataIda;
    }

    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
