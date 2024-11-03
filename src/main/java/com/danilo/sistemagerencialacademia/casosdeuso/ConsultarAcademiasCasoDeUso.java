package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Academia;
import com.danilo.sistemagerencialacademia.repositorio.IAcademiaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultarAcademiasCasoDeUso {

    @Autowired
    private IAcademiaRepositorio academiaRepositorio;

    public List<Academia> executar() {
        return academiaRepositorio.findAll();
    }
}
