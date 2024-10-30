package com.danilo.sistemagerencialacademia.enums;

public enum CargoEnum {
    PROFESSOR(1, "PROFESSOR"),
    RECEPCIONISTA(2, "RECEPCIONISTA"),
    LIMPEZA(2, "LIMPEZA");

    private final Integer id;
    private final String cargo;

    CargoEnum(Integer id, String cargo) {
        this.id = id;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public Integer getId() {
        return id;
    }
}
