package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
