package br.com.representacaoexternadedados.service;

import br.com.representacaoexternadedados.entity.Cargo;
import br.com.representacaoexternadedados.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
