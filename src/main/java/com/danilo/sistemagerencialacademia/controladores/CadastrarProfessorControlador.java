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
@RequestMapping("/professor")
public class CadastrarProfessorControlador {

    @Autowired
    private CadastrarMembroCasoDeUso cadastrarProfessorCasoDeUso;

    @PostMapping()
    public ResponseEntity cadastrarProfessor(@RequestBody @Valid ProfessorDto professorDto) {

        this.cadastrarProfessorCasoDeUso.execute(professorDto.nome, professorDto.dataNascimento, professorDto.dataAdmissao, professorDto.especializacao, professorDto.academiaId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public record ProfessorDto(@NotBlank String nome, @NotNull Date dataNascimento, @NotNull Date dataAdmissao, @NotNull String especializacao, @NotNull UUID academiaId) {}
}
