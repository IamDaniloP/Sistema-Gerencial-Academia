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

    @Column(name = "desc_aula")
    private String descAula;

    @Column(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    @Column(name = "quantidade_max_alunos", nullable = false)
    private Integer quantidadeMaximaAlunos;

    public Aula(UUID id, String descAula, Funcionario funcionario, Integer quantidadeMaximaAlunos) {
        this.id = id;
        this.descAula = descAula;
        this.funcionario = funcionario;
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescAula() {
        return descAula;
    }

    public void setDescAula(String descAula) {
        this.descAula = descAula;
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
