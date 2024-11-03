package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.CadastrarAcademiaCasoDeUso;
import com.danilo.sistemagerencialacademia.casosdeuso.CadastrarMembroCasoDeUso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/academia")
public class CadastrarAcademiaControlador {
    @Autowired
    private CadastrarAcademiaCasoDeUso cadastrarAcademiaCasoDeUso;

    @PostMapping()
    public ResponseEntity cadastrarAcademia(@Valid @RequestBody academiaDto academiaDto) {

        this.cadastrarAcademiaCasoDeUso.executar(academiaDto.filial);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public record academiaDto(@NotBlank String filial) {}
}