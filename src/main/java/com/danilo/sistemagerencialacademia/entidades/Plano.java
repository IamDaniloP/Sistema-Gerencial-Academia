package com.danilo.sistemagerencialacademia.entidades;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Plano {

    private UUID id;
    private BigDecimal valor;
    private Date dataInicioPlano;

    public Plano(UUID id, BigDecimal valor, Date dataInicioPlano) {
        this.id = id;
        this.valor = valor;
        this.dataInicioPlano = dataInicioPlano;
    }

    public Date getDataInicioPlano() {
        return dataInicioPlano;
    }

    public void setDataInicioPlano(Date dataInicioPlano) {
        this.dataInicioPlano = dataInicioPlano;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
