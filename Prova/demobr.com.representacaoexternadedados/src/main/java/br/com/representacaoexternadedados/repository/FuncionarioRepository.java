package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
