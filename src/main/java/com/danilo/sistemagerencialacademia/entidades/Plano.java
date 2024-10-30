package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "plano")
public class Plano {

    @Id
    @Column(name = "plano_id")
    private UUID id;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
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
