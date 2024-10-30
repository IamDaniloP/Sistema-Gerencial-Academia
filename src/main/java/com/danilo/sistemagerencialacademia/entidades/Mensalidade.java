package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "mensalidade")
public class Mensalidade {

    @Id
    @Column(name = "mensalidade_id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "status_mensalidade_id", nullable = false)
    private StatusMensalidade statusMensalidade;

    @Column(nullable = false)
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
