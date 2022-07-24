package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Autor;
import br.com.representacaoexternadedados.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
