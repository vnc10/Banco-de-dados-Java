package br.com.representacaoexternadedados.service;

import br.com.representacaoexternadedados.entity.Departamento;
import br.com.representacaoexternadedados.entity.Funcionario;
import br.com.representacaoexternadedados.repository.DepartamentoRepository;
import br.com.representacaoexternadedados.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    DepartamentoRepository departamentoRepository;

    @Autowired
    DepartamentoService departamentoService;

    public void save(){
        Optional<Departamento> departamento = departamentoService.findByName("Frete");
        Funcionario funcionario = new Funcionario("Vini2", 3, 3500, "Dev Jr", departamento.get());
        funcionarioRepository.save(funcionario);
    }

    public void listFuncByNameAndDependent(){
        Funcionario result = funcionarioRepository.findFuncionarioByNomeAndQtdeDependentes("Vini", 3).get();
        System.out.println(result.toString());
    }

    public void listFuncWithTheHigherSalary(){
        Funcionario result = funcionarioRepository.findTopByOrderBySalarioDesc();
        System.out.println(result.toString());
    }

    public void list3FuncWithTheHigherSalary(){
        List<Funcionario> result = funcionarioRepository.findFirst3ByOrderBySalarioDesc();
        System.out.println(result.toString());
    }

    public void listAllFuncByDepartamentName(){
        List<String> result = funcionarioRepository.findFuncionarioByDepartamentoNome("Frete");
        System.out.println(result.toString());
    }

    public void listFuncByWithOutDependByAsc(){
        List<Funcionario> result = funcionarioRepository.findFuncWithoutDependentsByAsc();
        System.out.println(result.toString());
    }

    public void listFuncWithHighestSalaryValue(){
        List<Funcionario> result = funcionarioRepository.findHighestSalary(5000);
        System.out.println(result.toString());
    }

    public void listFuncWithHighestSalaryValueWithNativeQuery(){
        List<Funcionario> result = funcionarioRepository.findHighestSalaryByNativeQuery(5000);
        System.out.println(result.toString());
    }

    public void findFuncByDependentQuantityUsingNamedQuery(){
        List<Funcionario> result = funcionarioRepository.findDepByQtdeDependentes(3);
        System.out.println(result.toString());
    }

    public void findByContainsName(){
        List<Funcionario> result = funcionarioRepository.findByContainsName("ini");
        System.out.println(result.toString());
    }

    public void increaseSalary(){
        funcionarioRepository.increase_all_employee_salary(10);
    }

    public void listFuncWithoutDependByDepart(){
        List<Funcionario> result = funcionarioRepository.findByNamedParam("Frete");
        System.out.println(result.toString());
    }

    public void changeDepartment(){
        Optional<Departamento> antigo = departamentoRepository.findByNome("Seg");
        Optional<Departamento> novo = departamentoRepository.findByNome("Frete");
        int result = funcionarioRepository.changeFuncFromDepartment(antigo.get(), novo.get());
        System.out.println(result);
    }

    public void deleteDepartment(){
        int result = funcionarioRepository.deleteDepartById(6L);
        System.out.println(result);
    }

}
