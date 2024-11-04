package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.ConsultarFrequenciaAlunoCasoDeUso;
import com.danilo.sistemagerencialacademia.entidades.Frequencia;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/frequencia")
public class ConsultarFrequenciaAlunoControlador {

    @Autowired
    private ConsultarFrequenciaAlunoCasoDeUso consultarFrequenciaAlunoCasoDeUso;

    @GetMapping
    public ResponseEntity consultarFrequenciaAluno(@RequestParam UUID aulaId, @RequestParam UUID alunoId) {
        List<Frequencia> frequenciasAluno = consultarFrequenciaAlunoCasoDeUso.executar(aulaId, alunoId);
        return ResponseEntity.status(HttpStatus.FOUND).body(frequenciasAluno);
    }
}
