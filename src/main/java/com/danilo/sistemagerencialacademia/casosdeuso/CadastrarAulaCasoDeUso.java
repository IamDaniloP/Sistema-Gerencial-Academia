package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.Aula;
import com.danilo.sistemagerencialacademia.repositorio.IAulaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CadastrarAulaCasoDeUso {

    @Autowired
    private IAulaRepositorio aulaRepositorio;

    public void executar(Aula aula) {
        aula.setId(UUID.randomUUID());
        aulaRepositorio.save(aula);
    }
}
