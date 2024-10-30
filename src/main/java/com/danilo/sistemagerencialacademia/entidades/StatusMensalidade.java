package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "status_mensalidade")
@Data
public class StatusMensalidade {

    @Id
    @Column(name = "status_mensalidade_id")
    private Integer id;

    @Column(name = "status_mensalidade")
    private String statusMensalidade;
}
