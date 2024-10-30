package com.danilo.sistemagerencialacademia.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Aula {

    private UUID id;
    private Funcionario funcionario;
    private Integer quantidadeMaximaAlunos;
    private List<Aluno> alunosInscritos;

    public Aula(UUID id, Funcionario funcionario, Integer quantidadeMaximaAlunos) {
        this.id = id;
        this.funcionario = funcionario;
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
        this.alunosInscritos = new ArrayList<>();
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

    public List<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunosInscritos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunosInscritos.remove(aluno);
    }
}
