package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "frequencia")
public class Frequencia implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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
