package com.biblioteca.umj.controllers;

import com.biblioteca.umj.dto.AlunosDTO;
import com.biblioteca.umj.entities.Alunos;
import com.biblioteca.umj.services.AlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoServices alunoServices;

    @PostMapping("/cadastro")
    public ResponseEntity<Alunos> save(@RequestBody Alunos aluno) {
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoServices.save(aluno));
    }

    @GetMapping
    public ResponseEntity<List<Alunos>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(alunoServices.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunosDTO> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(alunoServices.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAluno(@PathVariable Long id) {
        alunoServices.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/consulta/{cpf}")
    public ResponseEntity<Alunos> findByCpf(@PathVariable String cpf) {
        return ResponseEntity.status(HttpStatus.OK).body(alunoServices.findByCpf(cpf));
    }

}
