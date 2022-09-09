package br.com.representacaoexternadedados.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "telefone")
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;


    public Funcionario() {
    }
    public Funcionario(String nome, String sexo, String telefone, Cargo cargo) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.cargo = cargo;
    }
}
