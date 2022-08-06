package br.com.representacaoexternadedados.repository;

import br.com.representacaoexternadedados.entity.Departamento;
import br.com.representacaoexternadedados.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    //Listar um funcionário pelo seu nome e quantidade de dependentes utilizando consulta
    //por palavras-chaves.
    Optional<Funcionario> findFuncionarioByNomeAndQtdeDependentes(String name, int qtdeDependentes);

    //Listar todos os funcionários de um determinado departamento por JPQL via @Query.

    @Query("select f.nome from Funcionario f where f.departamento = (select d from Departamento d where d.nome = ?1)")
    List<String> findFuncionarioByDepartamentoNome(String nome);


    //Listar o primeiro funcionário que tem o maior salário.
    Funcionario findTopByOrderBySalarioDesc();

    //Listar os 3 (três) primeiros funcionários que tem os maiores salários.

    List<Funcionario> findFirst3ByOrderBySalarioDesc();

    //Listar os funcionários que não tem dependentes em ordem crescente de nome por JPQL
    //via @Query.

    @Query("select f from Funcionario f where f.qtdeDependentes = 0 order by f.nome asc")
    List<Funcionario> findFuncWithoutDependentsByAsc();

    //Listar os funcionários que tem salário maior que um determinado valor por JPQL
    //sobrescrevendo palavras-chaves @Query.

    @Query("select f from Funcionario f where f.salario >= ?1 order by f.nome asc")
    List<Funcionario> findHighestSalary(float salario);

    //Listar os funcionários que tem salário maior que um determinado valor por @Query
    //com native query.
    @Query(value = "select * from funcionario where salario >= ?1 order by nome asc", nativeQuery = true)
    List<Funcionario> findHighestSalaryByNativeQuery(float salario);

    //Alterar a interface FuncionarioRepository para utilizar a @NamedQuery e
    //@NamedNativeQuery realizadas nas questões 9 e 10 (respectivamente).

    //Alterar a classe Funcionario e criar uma consulta para listar os funcionários com uma
    //determinada quantidade de dependentes por @NamedQuery.

    @Query(name = "Funcionario.byQtdeDependentes")
    List<Funcionario> findDepByQtdeDependentes(int qtdeDependentes);

    //Alterar a classe Funcionario e criar uma consulta para listar os funcionários que
    //contenham em qualquer parte do seu nome um determinado nome por
    //@NamedNativeQuery.

    @Query(name = "Funcionario.containsName")
    List<Funcionario> findByContainsName(String nome);
}
