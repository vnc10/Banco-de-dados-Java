package br.com.representacaoexternadedados.service;

import br.com.representacaoexternadedados.entity.Departamento;
import br.com.representacaoexternadedados.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public void save(){
        Departamento departamento = new Departamento("Frete");
        departamentoRepository.save(departamento);
    }

    public Optional<Departamento> findByName(String nome){
        return departamentoRepository.findByNome(nome);
    }

    public void findFirstDepartament(){
        Departamento first = departamentoRepository.findFirstBy();
        System.out.println(first.toString());
    }

}
