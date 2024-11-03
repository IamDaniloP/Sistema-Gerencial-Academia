package com.danilo.sistemagerencialacademia.controladores;

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
@RequestMapping("/aluno")
public class CadastrarAlunoControlador {

    @Autowired
    private CadastrarMembroCasoDeUso cadastrarAlunoCasoDeUso;

    @PostMapping()
    public ResponseEntity cadastrarAluno(@RequestBody @Valid AlunoDto alunoDto) {

        this.cadastrarAlunoCasoDeUso.executar(alunoDto.nome, alunoDto.dataNascimento, alunoDto.academiaId, alunoDto.diaCobrancaPagamento);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public record AlunoDto(@NotBlank String nome, @NotNull Date dataNascimento, @NotNull UUID academiaId, @NotBlank Integer diaCobrancaPagamento) {}
}
