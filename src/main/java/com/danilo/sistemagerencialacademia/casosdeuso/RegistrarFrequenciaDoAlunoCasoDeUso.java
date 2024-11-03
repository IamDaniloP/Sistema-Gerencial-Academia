package com.danilo.sistemagerencialacademia.casosdeuso;

import com.danilo.sistemagerencialacademia.entidades.AulaAluno;
import com.danilo.sistemagerencialacademia.entidades.Frequencia;
import com.danilo.sistemagerencialacademia.repositorio.IAulaAlunoRepositorio;
import com.danilo.sistemagerencialacademia.repositorio.IFrequenciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class RegistrarFrequenciaDoAlunoCasoDeUso {

    @Autowired
    private IFrequenciaRepositorio frequenciaRepositorio;

    @Autowired
    private IAulaAlunoRepositorio aulaAlunoRepositorio;

    public void executar(UUID aulaId, UUID alunoId) {

        Optional<AulaAluno> aulaAluno = aulaAlunoRepositorio.consultarInscricaoDeAlunoPorAula(aulaId, alunoId);

        if (aulaAluno.isEmpty()) {
            throw new RuntimeException("Não foi encontrado a inscrição do aluno na aula");
        }

        Frequencia frequencia = new Frequencia(UUID.randomUUID(), new Date(),aulaAluno.get());
        frequenciaRepositorio.save(frequencia);
    }
}
