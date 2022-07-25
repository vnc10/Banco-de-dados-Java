package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    public Optional<Departamento> findByNome(String nome);
}
