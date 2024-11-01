package com.danilo.sistemagerencialacademia.entidades;

import com.danilo.sistemagerencialacademia.enums.CargoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "funcionario")
public class Funcionario extends Membro{

    @Column(name = "data_admissao", nullable = false)
    private Date dataAdmissao;

    public Funcionario(UUID id, String nome, Date dataNascimento, Date dataAdmissao, Academia academia) {
        super(id, nome, dataNascimento, academia);
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
