package br.com.representacaoexternadedados.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "autor")
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sexo")
    private String sexo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "autores_possuem_livros",
            joinColumns = {@JoinColumn(name = "id_autor")},
            inverseJoinColumns = {@JoinColumn(name = "id_livro")})
    private List<Livro> livros;

    public Autor(String nome, String sexo, List<Livro> livros) {
        this.nome = nome;
        this.sexo = sexo;
        this.livros = livros;
    }

    public Autor() {

    }
}
