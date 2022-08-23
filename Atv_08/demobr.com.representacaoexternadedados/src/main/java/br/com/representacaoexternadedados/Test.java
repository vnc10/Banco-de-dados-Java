package br.com.representacaoexternadedados;

import br.com.representacaoexternadedados.entity.Departamento;
import br.com.representacaoexternadedados.entity.Funcionario;
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
//        funcionarioService.listFuncByNameAndDependent();
//        departamentoService.findFirstDepartament();
//        funcionarioService.listFuncWithTheHigherSalary();
//        funcionarioService.list3FuncWithTheHigherSalary();
//        funcionarioService.listAllFuncByDepartamentName();
//        funcionarioService.listFuncByWithOutDependByAsc();
//        funcionarioService.listFuncWithHighestSalaryValue();
//        funcionarioService.listFuncWithHighestSalaryValueWithNativeQuery();
//        funcionarioService.findFuncByDependentQuantityUsingNamedQuery();
//        funcionarioService.findByContainsName();
//        funcionarioService.increaseSalary();
//        funcionarioService.listFuncWithoutDependByDepart();
//        funcionarioService.changeDepartment();
//        funcionarioService.deleteDepartment();

        Departamento departamento = new Departamento("Financeiro");
        Funcionario funcionario = new Funcionario("Vinicius", 0, 5000, "Jr");
        departamentoService.saveDepartmentAndLinkWithEmployee(departamento, funcionario);
    }
}
