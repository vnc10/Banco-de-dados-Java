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

    @Column(name = "qtde_dependentes")
    private int qtdeDependentes;

    @Column(name = "salario")
    private float salario;

    @Column(name = "cargo")
    private String cargo;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;


    public Funcionario() {
    }

    public Funcionario(String nome, int qtdeDependentes, float salario, String cargo, Departamento departamento) {
        this.nome = nome;
        this.qtdeDependentes = qtdeDependentes;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }
}
