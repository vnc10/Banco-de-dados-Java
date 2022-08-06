package br.com.representacaoexternadedados.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "funcionario")
@NamedQuery(name = "Funcionario.byQtdeDependentes",
query = "from Funcionario f where f.qtdeDependentes = ?1")

@NamedNativeQuery(name = "Funcionario.containsName",
query = "select * from funcionario where nome like CONCAT('%', ?1, '%')",
resultClass = Funcionario.class)

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

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", qtdeDependentes=" + qtdeDependentes +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", departamento=" + departamento.toString() +
                '}';
    }
}
