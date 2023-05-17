package com.biblioteca.umj.services;

import com.biblioteca.umj.dto.AlunosDTO;
import com.biblioteca.umj.entities.Alunos;
import com.biblioteca.umj.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoServices {

    @Autowired
    private AlunoRepository alunoRepository;

    public Alunos save(Alunos aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Alunos> findAll() {
        return alunoRepository.findAll();
    }

    public AlunosDTO findById(Long id) {
        Optional<Alunos> alunos = alunoRepository.findById(id);
        var alunoDTO = new AlunosDTO(alunos.get());
        return alunoDTO;
    }

    public Alunos findByCpf(String cpf) {
        return alunoRepository.findByCpf(cpf);
    }

    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }

}
