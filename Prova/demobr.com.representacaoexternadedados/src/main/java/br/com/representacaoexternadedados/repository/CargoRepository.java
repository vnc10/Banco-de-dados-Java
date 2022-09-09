package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Cargo;
import br.com.representacaoexternadedados.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

    Optional<Cargo> findByCargo(String cargo);
}
