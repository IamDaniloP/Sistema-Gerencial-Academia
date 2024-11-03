package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public abstract class Membro implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "data_nasc", nullable = false)
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name = "academia_id", nullable = false)
    private Academia academia;

    public Membro() {}

    public Membro(UUID id, String nome, Date dataNascimento, Academia academia) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.academia = academia;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
}
