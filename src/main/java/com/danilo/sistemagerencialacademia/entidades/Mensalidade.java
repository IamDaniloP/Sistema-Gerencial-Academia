package com.danilo.sistemagerencialacademia.entidades;


import com.danilo.sistemagerencialacademia.enums.StatusMensalidade;

import java.util.Date;
import java.util.UUID;

public class Mensalidade {

    private UUID id;
    private StatusMensalidade statusMensalidade;
    private Date dataPagamento;

    public Mensalidade(UUID id, StatusMensalidade statusMensalidade, Date dataPagamento) {
        this.id = id;
        this.statusMensalidade = statusMensalidade;
        this.dataPagamento = dataPagamento;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public StatusMensalidade getStatusMensalidade() {
        return statusMensalidade;
    }

    public void setStatusMensalidade(StatusMensalidade statusMensalidade) {
        this.statusMensalidade = statusMensalidade;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
