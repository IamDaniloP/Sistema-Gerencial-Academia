package com.danilo.sistemagerencialacademia.controladores;

import com.danilo.sistemagerencialacademia.casosdeuso.CadastrarAulaCasoDeUso;
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
@RequestMapping("/aula")
public class CadastrarAulaControlador {

    @Autowired
    private CadastrarAulaCasoDeUso cadastrarAulaCasoDeUso;

    @PostMapping()
    public ResponseEntity cadastrarAula(@RequestBody @Valid AulaDto aulaDto) {

        this.cadastrarAulaCasoDeUso.executar(aulaDto.descAula, aulaDto.quantidadeMaxAlunos, aulaDto.professorId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public record AulaDto(@NotBlank String descAula, @NotBlank Integer quantidadeMaxAlunos, @NotNull UUID professorId) {}
}


