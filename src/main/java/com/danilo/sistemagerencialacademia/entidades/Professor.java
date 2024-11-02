package com.danilo.sistemagerencialacademia.entidades;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "professor")
public class Professor extends Membro implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "data_admissao", nullable = false)
    private Date dataAdmissao;

    @Column(nullable = false)
    private String especializacao;

    public Professor(UUID id, String nome, Date dataNascimento, Date dataAdmissao, String especializacao, Academia academia) {
        super(id, nome, dataNascimento, academia);
        this.dataAdmissao = dataAdmissao;
        this.especializacao = especializacao;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
