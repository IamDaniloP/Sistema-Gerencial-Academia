package com.danilo.sistemagerencialacademia.entidades;

import java.util.Date;
import java.util.UUID;

public class Membro {

    private UUID id;
    private String nome;
    private Date dataNascimento;

    public Membro(UUID id, String nome, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
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
}
