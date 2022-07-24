package br.com.representacaoexternadedados.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String item;

    @Column(name = "quantidade")
    private int quantidade;


    public Cliente(String item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public Cliente() {

    }
}
