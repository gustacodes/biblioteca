package com.biblioteca.umj.repositories;

import com.biblioteca.umj.entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Alunos, Long> {

    Alunos findByCpf(String cpf);
}
