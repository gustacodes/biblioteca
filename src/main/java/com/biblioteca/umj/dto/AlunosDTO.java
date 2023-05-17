package com.biblioteca.umj.dto;

import com.biblioteca.umj.entities.Alunos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlunosDTO {

    private Long id;
    private String nome;
    private String email;
    private String contato;

    public AlunosDTO(Alunos aluno) {
        id = aluno.getId();
        nome = aluno.getNome();
        email = aluno.getEmail();
        contato = aluno.getContato();
    }
}
