package com.danilo.sistemagerencialacademia.entidades;

import com.danilo.sistemagerencialacademia.enums.Cargo;

import java.util.Date;
import java.util.UUID;

public class Funcionario extends Membro{

    private Cargo cargo;
    private Date dataAdmissao;

    public Funcionario(UUID id, String nome, Date dataNascimento, Cargo cargo, Date dataAdmissao) {
        super(id, nome, dataNascimento);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
