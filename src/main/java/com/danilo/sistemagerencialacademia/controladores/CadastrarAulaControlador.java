package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.CadastrarAulaCasoDeUso;
import com.danilo.sistemagerencialacademia.entidades.Aula;
import com.danilo.sistemagerencialacademia.entidades.Professor;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/aluno")
public class CadastrarAulaControlador {

    @Autowired
    private CadastrarAulaCasoDeUso cadastrarAulaCasoDeUso;

    @PostMapping
    public ResponseEntity create(@RequestBody @Valid Aula aula) {

        this.cadastrarAulaCasoDeUso.executar(aula);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}


