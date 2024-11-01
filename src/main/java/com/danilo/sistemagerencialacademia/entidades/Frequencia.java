package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "frequencia")
public class Frequencia {

    @Id
    @Column(name = "frequencia_id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "aula_aluno_id", nullable = false)
    private AulaAluno aulaAluno;

    public Frequencia(UUID id, AulaAluno aulaAluno) {
        this.id = id;
        this.aulaAluno = aulaAluno;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public AulaAluno getAulaAluno() {
        return aulaAluno;
    }

    public void setAulaAluno(AulaAluno aulaAluno) {
        this.aulaAluno = aulaAluno;
    }
}
