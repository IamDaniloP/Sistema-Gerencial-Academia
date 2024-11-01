package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "academia")
public class Academia {

    @Id
    @Column(name = "academia_id")
    private UUID id;

    @Column(nullable = false)
    private String filial;

    public Academia(UUID id, String filial) {
        this.id = id;
        this.filial = filial;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }
}
