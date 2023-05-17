package com.biblioteca.umj.services;

import com.biblioteca.umj.entities.Alunos;
import com.biblioteca.umj.entities.Livros;
import com.biblioteca.umj.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServices {

    @Autowired
    LivroRepository livroRepository;

    public Livros save(Livros livros) {
        return livroRepository.save(livros);
    }

    public List<Livros> findAll() {
        return livroRepository.findAll();
    }

    public Livros findByNome(String nome) {
        return livroRepository.findByNome(nome);
    }
}
