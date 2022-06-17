package demo;

import entities.*;
import models.AlunoModel;
import models.CursoModel;

import java.time.LocalDate;
import java.util.List;

public class GestaoCursosMain {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Curso curso = new Curso();
        Endereco endereco = new Endereco();
        Telefone telefone = new Telefone();
        MaterialCurso materialCurso = new MaterialCurso();

        //Alunos
        aluno.setNomeCompleto("Rober das Neves");
        aluno.setEnderecos(List.of(endereco));
        aluno.setCursos(List.of(curso));
        aluno.setMatricula("12A2022");
        aluno.setNascimento(LocalDate.of(1994, 6, 22));
        aluno.setEmail("robert.neves@gmail.com");
        aluno.setTelefones(List.of(telefone));

        //Professores
        professor.setCursos(List.of(curso));
        professor.setEmail("tadeu.franco@gmeil.com");
        professor.setNomeCompleto("Tadeu Franco");
        professor.setMatricula("321AB2022");
        professor.setCursos(List.of(curso));

        //Cursos
        curso.setMaterialCurso(materialCurso);
        curso.setAlunos(List.of(aluno));
        curso.setNome("Engenharia de Software");
        curso.setProfessor(professor);
        curso.setSigla("ENG_S");

        //Endereços
        endereco.setAluno(aluno);
        endereco.setEndereco("Av. Radial Oeste");
        endereco.setBairo("Maracanã");
        endereco.setCep("20550-013");
        endereco.setCidade("Rio de Janeiro");
        endereco.setEstado("Rio de Janeiro (RJ)");
        endereco.setLogradouro("12 Av");
        endereco.setNumero("860");

        //Telefones
        telefone.setAluno(aluno);
        telefone.setDdd("21");
        telefone.setNumero("9996453");


        //Materia Curso
        materialCurso.setCurso(curso);
        materialCurso.setUrl("http//programacao.com/engenharia");

        AlunoModel alunoModel = new AlunoModel();
        CursoModel cursoModel = new CursoModel();

        // 1) Criando um aluno
        alunoModel.create(aluno);
        cursoModel.create(curso);


        // 2) Buscando todos os produtos na base de dados
        List<Aluno> alunos = alunoModel.findAll();
        System.out.println("Qtde de alunos encontrados : " + alunos.size());
        alunoModel.delete(aluno);
//        List<Produto> produto = produtoModel.findAll();
//        System.out.println("Qtde de produtos encontrados : " + produto.size());
////
        // TODO - Testar os demais metódos das classes: ProdutoModel e PessoaModel

    }
}
