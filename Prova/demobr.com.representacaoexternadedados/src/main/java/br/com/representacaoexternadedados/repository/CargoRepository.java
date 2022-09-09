package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

    Optional<Cargo> findByCargo(String cargo);
}
