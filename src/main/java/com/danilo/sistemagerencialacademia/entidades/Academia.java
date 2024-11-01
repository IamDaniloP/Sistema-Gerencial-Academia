package com.danilo.sistemagerencialacademia.entidades;

import java.util.UUID;

// Será a própria api que terá os casos de uso.
public class Academia {
    private UUID id;
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
