package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		// Cria uma referência do tipo Curso
		Curso javaColecoes = new Curso("Dominando as colecoes do Java","Paulo Silveira");
		
		// Adiciona aulas direto do construtor
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		// Imprime a lista de aulas
		System.out.println(javaColecoes.getAulas());
	}
}
