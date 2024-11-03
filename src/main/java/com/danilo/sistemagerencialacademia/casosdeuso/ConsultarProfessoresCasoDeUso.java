package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Professor;
import com.danilo.sistemagerencialacademia.repositorio.IProfessorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultarProfessoresCasoDeUso {

    @Autowired
    private IProfessorRepositorio professorRepositorio;

    public List<Professor> executar() {
        return professorRepositorio.findAll();
    }
}
