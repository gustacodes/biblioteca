package com.biblioteca.umj.dto;

import com.biblioteca.umj.entities.Livros;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivrosDTO {

    private Long id;
    private String nome;
    private String autor;
    private Integer quantidade;

    public LivrosDTO(Livros livro) {
        id = livro.getId();
        nome = livro.getNome();
        autor = livro.getAutor();
        quantidade = livro.getQuantidade();
    }

}
