package com.biblioteca.umj.repositories;

import com.biblioteca.umj.entities.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livros, Long> {

    Livros findByNome(String nome);
}
