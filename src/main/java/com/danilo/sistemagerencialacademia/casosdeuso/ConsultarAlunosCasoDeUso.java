package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Aluno;
import com.danilo.sistemagerencialacademia.repositorio.IAlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultarAlunosCasoDeUso {

    @Autowired
    private IAlunoRepositorio alunoRepositorio;

    public List<Aluno> executar() {
        return alunoRepositorio.findAll();
    }
}
