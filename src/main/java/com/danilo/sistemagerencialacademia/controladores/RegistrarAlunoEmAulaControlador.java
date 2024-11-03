package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.RegistrarAlunoEmAulaCasoDeUso;
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

import java.util.UUID;

@RestController
@RequestMapping("/alunoaula")
public class RegistrarAlunoEmAulaControlador {

    @Autowired
    private RegistrarAlunoEmAulaCasoDeUso registrarAlunoEmAulaCasoDeUso;

    @PostMapping()
    public ResponseEntity registrarAlunoEmAula(@Valid @RequestBody AulaAlunoDto aulaAlunoDto) {
        registrarAlunoEmAulaCasoDeUso.executar(aulaAlunoDto.aulaId, aulaAlunoDto.alunoId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public record AulaAlunoDto(@NotNull UUID aulaId, @NotNull UUID alunoId) {}
}
