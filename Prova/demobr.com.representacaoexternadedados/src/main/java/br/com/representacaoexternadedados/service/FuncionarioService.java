package br.com.representacaoexternadedados.service;

import br.com.representacaoexternadedados.entity.Cargo;
import br.com.representacaoexternadedados.entity.Funcionario;
import br.com.representacaoexternadedados.repository.CargoRepository;
import br.com.representacaoexternadedados.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    CargoRepository cargoRepository;

    public void save(String cargoNome, String nomeFuncionario, String sexoFuncionario, String telefoneFuncionario){
        Optional<Cargo> cargo = cargoRepository.findByCargo(cargoNome);
        Funcionario funcionario = new Funcionario(nomeFuncionario, sexoFuncionario, telefoneFuncionario, cargo.get());
        funcionarioRepository.save(funcionario);
    }

    public void deleteById(Long id){
        funcionarioRepository.deleteById(id);
    }

}
