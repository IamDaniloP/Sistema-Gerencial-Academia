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

    @Column(name = "cargo_id", nullable = false)
    private CargoEnum cargoEnum;

    @Column(name = "data_admissao", nullable = false)
    private Date dataAdmissao;

    public Funcionario(UUID id, String nome, Date dataNascimento, CargoEnum cargoEnum, Date dataAdmissao) {
        super(id, nome, dataNascimento);
        this.cargoEnum = cargoEnum;
        this.dataAdmissao = dataAdmissao;
    }

    public CargoEnum getCargo() {
        return cargoEnum;
    }

    public void setCargo(CargoEnum cargoEnum) {
        this.cargoEnum = cargoEnum;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
