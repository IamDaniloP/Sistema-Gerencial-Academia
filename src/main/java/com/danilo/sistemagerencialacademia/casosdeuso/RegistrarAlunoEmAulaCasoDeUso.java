package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Aluno;
import com.danilo.sistemagerencialacademia.entidades.Aula;
import com.danilo.sistemagerencialacademia.entidades.AulaAluno;
import com.danilo.sistemagerencialacademia.repositorio.IAlunoRepositorio;
import com.danilo.sistemagerencialacademia.repositorio.IAulaAlunoRepositorio;
import com.danilo.sistemagerencialacademia.repositorio.IAulaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegistrarAlunoEmAulaCasoDeUso {

    @Autowired
    private IAulaRepositorio aulaRepositorio;

    @Autowired
    private IAlunoRepositorio alunoRepositorio;

    @Autowired
    private IAulaAlunoRepositorio aulaAlunoRepositorio;

    public void executar(UUID aulaId, UUID alunoId) {

        if (!(aulaRepositorio.existsById(aulaId) && alunoRepositorio.existsById(alunoId))) {
           throw new RuntimeException("Não foi encontrado registro de aula ou aluno");
        }

        Aula aula = aulaRepositorio.findById(aulaId).get();
        Aluno aluno = alunoRepositorio.findById(alunoId).get();

        if (aulaAlunoRepositorio.consultarQuantidadeDeAlunoPorAula(aulaId) >= aula.getQuantidadeMaximaAlunos()) {
            throw new RuntimeException("Capacidade máxima de alunos atingida");
        }

        AulaAluno aulaAluno = new AulaAluno(UUID.randomUUID(), aluno, aula);

        aulaAlunoRepositorio.save(aulaAluno);
    }
}
