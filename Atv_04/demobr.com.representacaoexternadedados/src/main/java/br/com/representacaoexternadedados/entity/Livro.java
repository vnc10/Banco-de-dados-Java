package br.com.representacaoexternadedados.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Livro")
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "genero")
    private String genero;

    @ManyToMany(mappedBy = "livros")
    private List<Autor> autores;

    public Livro(String isbn, String titulo, String genero) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.genero = genero;
    }

    public Livro() {

    }
}
