package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Autor;
import br.com.representacaoexternadedados.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
