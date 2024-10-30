package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "aula")
public class Aula {

    @Id
    @Column(name = "aula_id", nullable = false)
    private UUID id;

    @Column(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    @Column(name = "quantidade_max_alunos", nullable = false)
    private Integer quantidadeMaximaAlunos;

    public Aula(UUID id, Funcionario funcionario, Integer quantidadeMaximaAlunos) {
        this.id = id;
        this.funcionario = funcionario;
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getQuantidadeMaximaAlunos() {
        return quantidadeMaximaAlunos;
    }

    public void setQuantidadeMaximaAlunos(Integer quantidadeMaximaAlunos) {
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }
}
