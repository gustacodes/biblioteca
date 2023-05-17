package com.biblioteca.umj.controllers;

import com.biblioteca.umj.entities.Livros;
import com.biblioteca.umj.services.LivroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    LivroServices livroServices;

    @PostMapping("/cadastro")
    public Livros save(@RequestBody Livros livro) {
        return livroServices.save(livro);
    }

    @GetMapping
    public List<Livros> findAll() {
        return livroServices.findAll();
    }

    @GetMapping("/{nome}")
    public Livros findByNome(@PathVariable String nome) {
        Livros livro = livroServices.findByNome(nome);
        return livro;
    }

}
