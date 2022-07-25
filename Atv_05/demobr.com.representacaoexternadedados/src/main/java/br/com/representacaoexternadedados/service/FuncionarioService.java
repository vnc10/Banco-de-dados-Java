package br.com.representacaoexternadedados.service;

import br.com.representacaoexternadedados.entity.Departamento;
import br.com.representacaoexternadedados.entity.Funcionario;
import br.com.representacaoexternadedados.repository.DepartamentoRepository;
import br.com.representacaoexternadedados.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    DepartamentoService departamentoService;

    public void save(){
        Optional<Departamento> departamento = departamentoService.findByName("Frete");
        Funcionario funcionario = new Funcionario("Vini", 3, 3500, "Dev Jr", departamento.get().getId());
        funcionarioRepository.save(funcionario);
    }

}
