package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Cliente;
import br.com.representacaoexternadedados.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
