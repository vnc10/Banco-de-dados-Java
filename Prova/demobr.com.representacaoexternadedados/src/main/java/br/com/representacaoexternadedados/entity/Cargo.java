package br.com.representacaoexternadedados.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cargo")
public class Cargo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cargo")
    private String cargo;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cargo")
    private List<Funcionario> funcionarioList;

    public Cargo() {
    }

    public Cargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "id=" + id +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
