package com.biblioteca.umj.controllers;

import com.biblioteca.umj.entities.Livros;
import com.biblioteca.umj.services.LivroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    LivroServices livroServices;

    @PostMapping("/cadastro")
    public ResponseEntity<Livros> save(@RequestBody Livros livro) {
        return ResponseEntity.status(HttpStatus.CREATED).body(livroServices.save(livro));
    }

    @GetMapping
    public ResponseEntity<List<Livros>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(livroServices.findAll());
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Livros> findByNome(@PathVariable String nome) {
        Livros livro = livroServices.findByNome(nome);
        return ResponseEntity.status(HttpStatus.OK).body(livro);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        livroServices.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
