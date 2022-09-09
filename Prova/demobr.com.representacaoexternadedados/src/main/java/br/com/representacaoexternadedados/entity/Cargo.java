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

    @OneToMany(mappedBy = "funcionario")
    private List<Funcionario> funcionarioList;

}
