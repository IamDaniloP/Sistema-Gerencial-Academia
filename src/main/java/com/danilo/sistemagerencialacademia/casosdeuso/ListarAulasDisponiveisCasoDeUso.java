package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Aula;
import com.danilo.sistemagerencialacademia.repositorio.IAulaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarAulasDisponiveisCasoDeUso {

    @Autowired
    private IAulaRepositorio aulaRepositorio;

    public List<Aula> executar() {
        return aulaRepositorio.findAll();
    }
}
