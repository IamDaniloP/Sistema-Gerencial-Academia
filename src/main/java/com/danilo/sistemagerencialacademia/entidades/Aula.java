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

    @Column(name = "professor_id", nullable = false)
    private Professor professor;

    @Column(name = "quantidade_max_alunos", nullable = false)
    private Integer quantidadeMaximaAlunos;

    public Aula(UUID id, String descAula, Professor professor, Integer quantidadeMaximaAlunos) {
        this.id = id;
        this.descAula = descAula;
        this.professor = professor;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Integer getQuantidadeMaximaAlunos() {
        return quantidadeMaximaAlunos;
    }

    public void setQuantidadeMaximaAlunos(Integer quantidadeMaximaAlunos) {
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }
}
