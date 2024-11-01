package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Entity
public class Aluno extends Membro{

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
