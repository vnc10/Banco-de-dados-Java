package br.com.representacaoexternadedados;

import br.com.representacaoexternadedados.service.CargoService;
import br.com.representacaoexternadedados.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {


    @Autowired
    FuncionarioService funcionarioService;

    @Autowired
    CargoService cargoService;

    @Override
    public void run(String... args) {
//        cargoService.save("Gerente");
//        funcionarioService.save("Gerente", "Vinicius", "Masculino", "4444-4444");
        funcionarioService.deleteById(3L);
        cargoService.deleteById(6L);
    }
}
