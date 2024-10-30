package com.danilo.sistemagerencialacademia.entidades;

public class FrequenciaAulaAluno {

    private Aula aula;
    private Aluno aluno;

    public FrequenciaAulaAluno(Aluno aluno, Aula aula) {
        this.aluno = aluno;
        this.aula = aula;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
