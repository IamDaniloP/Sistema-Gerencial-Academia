package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Aluno;
import com.danilo.sistemagerencialacademia.entidades.Aula;
import com.danilo.sistemagerencialacademia.entidades.Professor;
import com.danilo.sistemagerencialacademia.repositorio.IAulaRepositorio;
import com.danilo.sistemagerencialacademia.repositorio.IProfessorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CadastrarAulaCasoDeUso {

    @Autowired
    private IAulaRepositorio aulaRepositorio;

    @Autowired
    private IProfessorRepositorio professorRepositorio;

    public void executar(String descAula, Integer quantidadeMaxAlunos, UUID professorId) {

        Optional<Professor> professor = professorRepositorio.findById(professorId);

        if (professor.isEmpty()) {
            throw new RuntimeException("Professor não encontrado");
        }

        Aula aula = new Aula(UUID.randomUUID(), descAula, professor.get(), quantidadeMaxAlunos);
        aulaRepositorio.save(aula);
    }
}
