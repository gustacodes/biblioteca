package com.biblioteca.umj.controllers;

import com.biblioteca.umj.dto.AlunosDTO;
import com.biblioteca.umj.entities.Alunos;
import com.biblioteca.umj.services.AlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoServices alunoServices;

    @PostMapping("/cadastro")
    public Alunos save(@RequestBody Alunos aluno) {
        return alunoServices.save(aluno);
    }

    @GetMapping
    public List<Alunos> findAll() {
        return alunoServices.findAll();
    }

    @GetMapping("/{id}")
    public AlunosDTO findById(@PathVariable Long id) {
        return alunoServices.findById(id);
    }

}
