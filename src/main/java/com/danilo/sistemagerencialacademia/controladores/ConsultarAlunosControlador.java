package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.ConsultarAlunosCasoDeUso;
import com.danilo.sistemagerencialacademia.entidades.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class ConsultarAlunosControlador {

    @Autowired
    private ConsultarAlunosCasoDeUso consultarAlunosCasoDeUso;

    @GetMapping()
    public ResponseEntity consultarAluno() {
        List<Aluno> alunos = consultarAlunosCasoDeUso.executar();
        return ResponseEntity.status(HttpStatus.FOUND).body(alunos);
    }
}
