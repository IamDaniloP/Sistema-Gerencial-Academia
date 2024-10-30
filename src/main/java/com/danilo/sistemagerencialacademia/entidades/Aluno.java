package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "aluno")
public class Aluno extends Membro{

    @Column(nullable = false)
    private Integer diaCobrancaPagamento;

    @Column(nullable = false)
    private Plano plano;

    @Column(nullable = false)
    private Mensalidade mensalidade;


    public Aluno(UUID id, String nome, Date dataNascimento, Integer diaCobrancaPagamento, Plano plano, Mensalidade mensalidade) {
        super(id, nome, dataNascimento);
        this.diaCobrancaPagamento = diaCobrancaPagamento;
        this.plano = plano;
        this.mensalidade = mensalidade;
    }

    public Integer getDiaCobrancaPagamento() {
        return diaCobrancaPagamento;
    }

    public void setDiaCobrancaPagamento(Integer diaCobrancaPagamento) {
        this.diaCobrancaPagamento = diaCobrancaPagamento;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Mensalidade mensalidade) {
        this.mensalidade = mensalidade;
    }
}
