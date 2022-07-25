package br.com.representacaoexternadedados.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "departamento")
public class Departamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_departamento")
    private List<Funcionario> funcionario;

    public Departamento() {
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }
}
