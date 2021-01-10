package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		// Cria uma referência do tipo Curso
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		// Adiciona aulas direto do construtor
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		// Cria novos alunos
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Maurício Aniche", 17645);

		// Adiciona os alunos no Curso
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);
	}
}
