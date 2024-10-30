package com.danilo.sistemagerencialacademia.entidades;

import java.util.Date;
import java.util.UUID;

public class Aluno extends Membro{

    private Integer diaCobrancaPagamento;
    private Plano plano;
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
