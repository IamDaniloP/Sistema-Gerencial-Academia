package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.ConsultarAlunosCasoDeUso;
import com.danilo.sistemagerencialacademia.casosdeuso.ConsultarProfessoresCasoDeUso;
import com.danilo.sistemagerencialacademia.entidades.Aluno;
import com.danilo.sistemagerencialacademia.entidades.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ConsultarProfessoresControlador {

    @Autowired
    private ConsultarProfessoresCasoDeUso consultarProfessoresCasoDeUso;

    @GetMapping()
    public ResponseEntity consultarAluno() {
        List<Professor> professores = consultarProfessoresCasoDeUso.executar();
        return ResponseEntity.status(HttpStatus.FOUND).body(professores);
    }
}
