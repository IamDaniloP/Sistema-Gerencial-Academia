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

    @Column(name = "data")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "aual_id", nullable = false)
    private AulaAluno aulaAluno;

    public Frequencia() {}

    public Frequencia(UUID id, Date date, AulaAluno aulaAluno) {
        this.id = id;
        this.date = date;
        this.aulaAluno = aulaAluno;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AulaAluno getAulaAluno() {
        return aulaAluno;
    }

    public void setAulaAluno(AulaAluno aulaAluno) {
        this.aulaAluno = aulaAluno;
    }
}
