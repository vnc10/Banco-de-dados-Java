package br.com.representacaoexternadedados.service;

import br.com.representacaoexternadedados.entity.Departamento;
import br.com.representacaoexternadedados.entity.Funcionario;
import br.com.representacaoexternadedados.repository.DepartamentoRepository;
import br.com.representacaoexternadedados.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    @Autowired
    FuncionarioRepository funcionarioRepository;

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

    //Atividade 08
    @Transactional
    public void saveDepartmentAndLinkWithEmployee(Departamento departamento, Funcionario funcionario){
        departamentoRepository.save(departamento);
        funcionario.setDepartamento(departamento);
        funcionarioRepository.save(funcionario);

    }

}
