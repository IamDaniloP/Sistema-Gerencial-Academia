package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.ConsultarAcademiasCasoDeUso;
import com.danilo.sistemagerencialacademia.entidades.Academia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/academia")
public class ConsultarAcademiaControlador {

    @Autowired
    private ConsultarAcademiasCasoDeUso consultarAcademiasCasoDeUso;

    @GetMapping()
    public ResponseEntity consultarAcademia() {
        List<Academia> academias = consultarAcademiasCasoDeUso.executar();

        return ResponseEntity.status(HttpStatus.FOUND).body(academias);
    }
}
