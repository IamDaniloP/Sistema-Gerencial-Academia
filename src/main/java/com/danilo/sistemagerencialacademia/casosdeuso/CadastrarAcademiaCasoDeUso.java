package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Academia;
import com.danilo.sistemagerencialacademia.entidades.Aluno;
import com.danilo.sistemagerencialacademia.entidades.Aula;
import com.danilo.sistemagerencialacademia.entidades.Professor;
import com.danilo.sistemagerencialacademia.repositorio.IAcademiaRepositorio;
import com.danilo.sistemagerencialacademia.repositorio.IAulaRepositorio;
import com.danilo.sistemagerencialacademia.repositorio.IProfessorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CadastrarAcademiaCasoDeUso {

    @Autowired
    private IAcademiaRepositorio academiaRepositorio;

    public void executar(String filial) {
        Academia academia = new Academia(UUID.randomUUID(), filial);
        academiaRepositorio.save(academia);
    }
}
