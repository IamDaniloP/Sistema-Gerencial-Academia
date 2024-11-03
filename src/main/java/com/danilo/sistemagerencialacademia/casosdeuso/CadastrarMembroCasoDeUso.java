package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Academia;
import com.danilo.sistemagerencialacademia.entidades.Aluno;
import com.danilo.sistemagerencialacademia.entidades.Professor;
import com.danilo.sistemagerencialacademia.repositorio.IAcademiaRepositorio;
import com.danilo.sistemagerencialacademia.repositorio.IAlunoRepositorio;
import com.danilo.sistemagerencialacademia.repositorio.IProfessorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class CadastrarMembroCasoDeUso {

    @Autowired
    private IProfessorRepositorio professorRepositorio;

    @Autowired
    private IAlunoRepositorio alunoRepositorio;

    @Autowired
    private IAcademiaRepositorio academiaRepositorio;

    public void executar(String nome, Date dataNascimento, UUID academiaId, Integer diaCobrancaPagamento) {

        Optional<Academia> academia = academiaRepositorio.findById(academiaId);

        if (academia.isEmpty()) {
            throw new RuntimeException("Academia não encontrada");
        }

        Aluno aluno = new Aluno(UUID.randomUUID(), nome, dataNascimento, academia.get(), diaCobrancaPagamento);
        alunoRepositorio.save(aluno);
    }

    public void execute(String nome, Date dataNascimento, Date dataAdmissao, String especializacao, UUID academiaId) {
        Optional<Academia> academia = academiaRepositorio.findById(academiaId);

        if (academia.isEmpty()) {
            throw new RuntimeException("Academia não encontrada");
        }

        Professor professor = new Professor(UUID.randomUUID(), nome, dataNascimento, dataAdmissao, especializacao, academia.get());
        professorRepositorio.save(professor);
    }
}
