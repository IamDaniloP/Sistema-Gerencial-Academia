package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Aluno;
import com.danilo.sistemagerencialacademia.entidades.Professor;
import com.danilo.sistemagerencialacademia.repositorio.IAlunoRepositorio;
import com.danilo.sistemagerencialacademia.repositorio.IProfessorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CadastrarMembrosAcademiaCasoDeUso {

    @Autowired
    private IProfessorRepositorio professorRepositorio;

    @Autowired
    private IAlunoRepositorio alunoRepositorio;

    public void executar(Aluno aluno) {
        aluno.setId(UUID.randomUUID());
        alunoRepositorio.save(aluno);
    }

    public void execute(Professor professor) {
        professor.setId(UUID.randomUUID());
        professorRepositorio.save(professor);
    }
}
