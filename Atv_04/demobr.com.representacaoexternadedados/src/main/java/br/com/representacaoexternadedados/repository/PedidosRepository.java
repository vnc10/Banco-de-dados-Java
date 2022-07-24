package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Cliente;
import br.com.representacaoexternadedados.entity.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}
