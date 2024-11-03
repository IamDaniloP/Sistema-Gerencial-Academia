package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.RegistrarFrequenciaDoAlunoCasoDeUso;
import com.danilo.sistemagerencialacademia.entidades.AulaAluno;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/frequencia")
public class RegistrarFrequenciaDoAlunoControlador {

    @Autowired
    private RegistrarFrequenciaDoAlunoCasoDeUso registrarFrequenciaDoAlunoCasoDeUso;

    @PostMapping()
    public ResponseEntity registrarFrequenciaDoAluno(@Valid @RequestBody FrequenciaDto frequenciaDto) {

        registrarFrequenciaDoAlunoCasoDeUso.executar(frequenciaDto.aulaId, frequenciaDto.alunoId);
        return ResponseEntity.ok().build();
    }

    public record FrequenciaDto(@NotNull Date date, @NotNull UUID aulaId, @NotNull UUID alunoId) {}
}
