package br.com.representacaoexternadedados;

import br.com.representacaoexternadedados.service.DepartamentoService;
import br.com.representacaoexternadedados.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {

    @Autowired
    DepartamentoService departamentoService;

    @Autowired
    FuncionarioService funcionarioService;

    @Override
    public void run(String... args) {
        funcionarioService.save();
    }
}
