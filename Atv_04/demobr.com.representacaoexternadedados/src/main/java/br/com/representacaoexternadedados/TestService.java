package br.com.representacaoexternadedados;

import br.com.representacaoexternadedados.entity.Autor;
import br.com.representacaoexternadedados.entity.Departamento;
import br.com.representacaoexternadedados.entity.Funcionario;
import br.com.representacaoexternadedados.entity.Livro;
import br.com.representacaoexternadedados.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TestService implements CommandLineRunner {

    @Autowired
    DepartamentoRepository departamentoRepository;

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    PedidosRepository pedidosRepository;

    @Autowired
    AutorRepository autorRepository;

    @Autowired
    LivroRepository livroRepository;

    @Override
    public void run(String... args) {
        Livro livroA = new Livro("12312331", "Teste", "Terror");
        Livro livroB = new Livro("12312331", "Teste2", "Terror3");
        Livro livroC = new Livro("12312331", "Teste3", "Terror2");

        List<Livro> livros = new ArrayList<>();
        livros.add(livroA);
        livros.add(livroB);
        livros.add(livroC);

        Autor autor = new Autor("vini", "masc", livros);
        autorRepository.save(autor);
    }

}
