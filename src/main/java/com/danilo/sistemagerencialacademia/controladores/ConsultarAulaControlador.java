package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.ConsultarAulasDisponiveisCasoDeUso;
import com.danilo.sistemagerencialacademia.entidades.Aula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aula")
public class ConsultarAulaControlador {

    @Autowired
    private ConsultarAulasDisponiveisCasoDeUso consultarAulasDisponiveisCasoDeUso;

    @GetMapping()
    public ResponseEntity consultarAulasDisponiveisCasoDeUso() {
        List<Aula> aulas = consultarAulasDisponiveisCasoDeUso.executar();
        return ResponseEntity.ok().body(aulas);
    }
}
