package br.com.representacaoexternadedados.service;

import br.com.representacaoexternadedados.entity.Cargo;
import br.com.representacaoexternadedados.entity.Funcionario;
import br.com.representacaoexternadedados.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    CargoRepository cargoRepository;


    public void save(String cargoNome){
        Cargo cargo = new Cargo(cargoNome);
        cargoRepository.save(cargo);
    }

    public void deleteById(Long id){
        cargoRepository.deleteById(id);
    }

    public void findAll(){
        List<Cargo> list = cargoRepository.findAll();
        for (Cargo cargo : list) {
            System.out.println(cargo.getCargo());
            System.out.println(cargo.getFuncionarioList());
        }
    }

}
