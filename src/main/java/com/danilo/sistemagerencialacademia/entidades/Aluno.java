package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "aluno")
public class Aluno extends Membro implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private Integer diaCobrancaPagamento;


    public Aluno(UUID id, String nome, Date dataNascimento, Academia academia, Integer diaCobrancaPagamento) {
        super(id, nome, dataNascimento, academia);
        this.diaCobrancaPagamento = diaCobrancaPagamento;
    }

    public Integer getDiaCobrancaPagamento() {
        return diaCobrancaPagamento;
    }

    public void setDiaCobrancaPagamento(Integer diaCobrancaPagamento) {
        this.diaCobrancaPagamento = diaCobrancaPagamento;
    }
}
