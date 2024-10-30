package com.danilo.sistemagerencialacademia.enums;

public enum StatusMensalidadeEnum {
    PAGO(1, "PAGO"),
    EM_ESPERA(2, "EM_ESPERA"),
    VENCIDO(3, "VENCIDO");

    private Integer id;
    private String statusMensalidade;

    StatusMensalidadeEnum(Integer id, String statusMensalidade) {
        this.id = id;
        this.statusMensalidade = statusMensalidade;
    }

    public Integer getId() {
        return id;
    }

    public String getStatusMensalidade() {
        return statusMensalidade;
    }
}
